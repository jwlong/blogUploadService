package com.dxfjyygy.mdl;

public class WovenProductCovertPattern {
	private long pkId;
	private String patternDisplayName;
	private String patternFieldName;
	private String patternFiledValue;
	public long getPkId() {
		return pkId;
	}
	public void setPkId(long pkId) {
		this.pkId = pkId;
	}
	public String getPatternFieldName() {
		return patternFieldName;
	}
	public void setPatternFieldName(String patternFieldName) {
		this.patternFieldName = patternFieldName;
	}
	public String getPatternFiledValue() {
		return patternFiledValue;
	}
	public void setPatternFiledValue(String patternFiledValue) {
		this.patternFiledValue = patternFiledValue;
	}
	
	public String getPatternDisplayName() {
		return patternDisplayName;
	}
	public void setPatternDisplayName(String patternDisplayName) {
		this.patternDisplayName = patternDisplayName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patternDisplayName == null) ? 0 : patternDisplayName.hashCode());
		result = prime * result + ((patternFieldName == null) ? 0 : patternFieldName.hashCode());
		result = prime * result + ((patternFiledValue == null) ? 0 : patternFiledValue.hashCode());
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
		WovenProductCovertPattern other = (WovenProductCovertPattern) obj;
		if (patternDisplayName == null) {
			if (other.patternDisplayName != null)
				return false;
		} else if (!patternDisplayName.equals(other.patternDisplayName))
			return false;
		if (patternFieldName == null) {
			if (other.patternFieldName != null)
				return false;
		} else if (!patternFieldName.equals(other.patternFieldName))
			return false;
		if (patternFiledValue == null) {
			if (other.patternFiledValue != null)
				return false;
		} else if (!patternFiledValue.equals(other.patternFiledValue))
			return false;
		return true;
	}

}
