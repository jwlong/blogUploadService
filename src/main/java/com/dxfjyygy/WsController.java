package com.dxfjyygy;

import com.dxfjyygy.mdl.User;
import com.sml.eplatform.inplant.webservice.EOrderInfoExtraction;
import com.sml.eplatform.inplant.webservice.EOrderInfoExtractionImplService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by longjinwen on 19/10/2017.
 */
@Controller
public class WsController {
    @RequestMapping("ws")
    public String login(){
        return "/login";
    }
    @RequestMapping("login")
    public String loginHandler(Model model,@RequestParam("loginId") String loginId,@RequestParam("password") String password,
        @RequestParam("ProgramId") String programId,@RequestParam("SubProgramId") String subProgramId,
       @RequestParam("FormatCode") String formatCode,@RequestParam("FormatVersion") String formatVersion
    ){
        System.out.println(loginId+"=============="+password);
        User user = null;
        if(!"".equals(loginId) && !"".equals(password)){
            user = new User(loginId,password);

        }
//        ModelAndView view = new ModelAndView();
        EOrderInfoExtractionImplService factory = new EOrderInfoExtractionImplService();
        EOrderInfoExtraction eInfoExtraction = factory.getEOrderInfoExtractionImplPort();
        String xmlStr = getXMLStr(programId,subProgramId,formatCode,formatVersion);
        String result =  eInfoExtraction.getFormatData(loginId,password,xmlStr);
        user.setResultJson(result);
        model.addAttribute("user",user);
        return "/main";
    }

    public String getXMLStr(String pid,String sid,String fc,String version){
        String formatXmlStr = "<format ProgramId =\"%s\" SubProgramId=\"%s\" FormatCode=\"%s\" FormatVersion=\"%s\"></format>";
        return String.format(formatXmlStr,pid,sid,fc,version);
    }


}
