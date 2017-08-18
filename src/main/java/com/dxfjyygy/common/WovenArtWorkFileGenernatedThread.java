package com.dxfjyygy.common;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.dxfjyygy.mdl.WovenProductConvertMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class WovenArtWorkFileGenernatedThread implements Runnable{
    private WovenProductConvertMap wovenCovertMap;
    Log log = LogFactory.getLog(WovenArtWorkFileGenernatedThread.class);
    public WovenArtWorkFileGenernatedThread(WovenProductConvertMap wovenCovertMap) {
        this.wovenCovertMap = wovenCovertMap;
    }

    @Override
    public void run() {
        if(log.isDebugEnabled()){
            log.debug(">>>start of WovenArtWorkFileGenernatedThread");
        }
        FileOutputStream fos = null;
        BufferedOutputStream out = null;
        InputStream read = null;
        ZipFile zf = null;
        File tmpFile = null;
        String pdfSuffix = ".pdf";
        String productCode = wovenCovertMap.getChildProductCode();
        String productStyle = wovenCovertMap.getChildStyle();
        String inFix = "-PTN";
        try{
            String artWorkFileNameUrl  = "";
            String workOrderNo = "";
            String productionCompany = wovenCovertMap.getProductionCompany();
            String erpSoNumber = "";
            boolean isReady = true;

            System.out.println("womap:"+wovenCovertMap.getEpSoNo());
            Thread.sleep(200);
//            if(isReady){
//                //EP SO+item.pk_id
//                Map<String, Object> map = new HashMap<String, Object>();
//                ByteArrayOutputStream baos = new ByteArrayOutputStream();
//                String headPath = config.getPdsArtworkRootPath()+"/"+productCode+"/"
//                        +productStyle+"/"+productionCompany+"/";
//                File dirFile = new File(headPath);
//                if(!dirFile.exists()){
//                    dirFile.mkdirs();
//                }
//                //String oldArtWorkFileName =  proFileName.replace(".zip", "")+"/"+profilePrintName.replace(".xlsx", ".pdf");
//                String oldArtWorkFileName = profilePrintName.replace(".xlsx", ".pdf");
//                String storeProFileName  = headPath + proFileName;
//                tmpFile = new File(storeProFileName);
//                if(!tmpFile.exists()){
//                    if(tmpFile.createNewFile()){
//                        approvalProService.approvalProDownload(proFileName, baos);
//                        fos = new FileOutputStream(tmpFile);
//                        fos.write(baos.toByteArray());
//                    }
//                }
//                zf = new ZipFile(tmpFile);
//                Enumeration entries  = zf.entries();
//                ZipEntry entry = null;
//                artWorkFileNameUrl = headPath + productCode+productStyle+pdfSuffix;
//                while(entries.hasMoreElements()){
//                    entry = (ZipEntry) entries.nextElement();
//                    if(entry.getName().equalsIgnoreCase(oldArtWorkFileName)){
//                        File descFile = new File(artWorkFileNameUrl.toUpperCase());
//                        read = zf.getInputStream(entry);
//                        if(!descFile.exists())
//                            descFile.createNewFile();
//                        out = new BufferedOutputStream(
//                                new FileOutputStream(descFile));
//                        int cha = 0;
//                        while((cha = read.read()) != -1){
//                            out.write(cha);
//                        }
//
//                    }
//                }
//
//            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(out != null){
                    out.close();
                }
                if(read != null){
                    read.close();
                }
                if(fos !=null ){
                    fos.close();
                }
                if(zf !=null){
                    zf.close();
                }
                if(tmpFile != null){
                    if(!tmpFile.delete()){
                        if(log.isDebugEnabled()){
                            log.debug(">>> delete tmp file fail!");
                        }
                    }
                }
                if(log.isDebugEnabled()){
                    log.debug(">>>end of WovenArtWorkFileGenernatedThread");
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
