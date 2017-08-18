package com.dxfjyygy.mdl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class WovenProductConvertMap {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((childProductCode == null) ? 0 : childProductCode.hashCode());
		result = prime * result + ((childStyle == null) ? 0 : childStyle.hashCode());
		result = prime * result + ((epSoNo == null) ? 0 : epSoNo.hashCode());
		result = prime * result + ((masterProductCode == null) ? 0 : masterProductCode.hashCode());
		result = prime * result + ((masterStyle == null) ? 0 : masterStyle.hashCode());
		result = prime * result + ((patternSet == null) ? 0 : patternSet.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WovenProductConvertMap other = (WovenProductConvertMap) obj;
		if (childProductCode == null) {
			if (other.childProductCode != null)
				return false;
		} else if (!childProductCode.equals(other.childProductCode))
			return false;
		if (childStyle == null) {
			if (other.childStyle != null)
				return false;
		} else if (!childStyle.equals(other.childStyle))
			return false;
		if (epSoNo == null) {
			if (other.epSoNo != null)
				return false;
		} else if (!epSoNo.equals(other.epSoNo))
			return false;
		if (masterProductCode == null) {
			if (other.masterProductCode != null)
				return false;
		} else if (!masterProductCode.equals(other.masterProductCode))
			return false;
		if (masterStyle == null) {
			if (other.masterStyle != null)
				return false;
		} else if (!masterStyle.equals(other.masterStyle))
			return false;
		if (patternSet == null) {
			if (other.patternSet != null)
				return false;
		} else if (!patternSet.equals(other.patternSet))
			return false;
		return true;
	}
	private long pkId;
	private String epSoNo;
	private String childProductCode;
	private String childStyle;
	private String  masterProductCode;
	private String  masterStyle;
	private Integer skuRowNumber;
	private String artworkFileName;
	private long refSoId;
	private long itemId;
	private String productionCompany;
	private Set<WovenProductCovertPattern> patternSet = new HashSet<WovenProductCovertPattern>();
	private Date createDate;
	public Set<WovenProductCovertPattern> getPatternSet() {
		return patternSet;
	}
	public void setPatternSet(Set<WovenProductCovertPattern> patternSet) {
		this.patternSet = patternSet;
	}
	public long getPkId() {
		return pkId;
	}
	public void setPkId(long pkId) {
		this.pkId = pkId;
	}
	public String getMasterProductCode() {
		return masterProductCode;
	}
	public void setMasterProductCode(String masterProductCode) {
		this.masterProductCode = masterProductCode;
	}
	public String getEpSoNo() {
		return epSoNo;
	}
	public void setEpSoNo(String epSoNo) {
		this.epSoNo = epSoNo;
	}
	public String getChildProductCode() {
		return childProductCode;
	}
	public void setChildProductCode(String childProductCode) {
		this.childProductCode = childProductCode;
	}
	public String getChildStyle() {
		return childStyle;
	}
	public void setChildStyle(String childStyle) {
		this.childStyle = childStyle;
	}
	public String getMasterStyle() {
		return masterStyle;
	}
	public void setMasterStyle(String masterStyle) {
		this.masterStyle = masterStyle;
	}
	
	public Integer getSkuRowNumber() {
		return skuRowNumber;
	}
	public void setSkuRowNumber(Integer skuRowNumber) {
		this.skuRowNumber = skuRowNumber;
	}
	public String getArtworkFileName() {
		return artworkFileName;
	}
	public void setArtworkFileName(String artworkFileName) {
		this.artworkFileName = artworkFileName;
	}

	public String getProductionCompany() {
		return productionCompany;
	}
	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public long getRefSoId() {
		return refSoId;
	}
	public void setRefSoId(long refSoId) {
		this.refSoId = refSoId;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
}	
