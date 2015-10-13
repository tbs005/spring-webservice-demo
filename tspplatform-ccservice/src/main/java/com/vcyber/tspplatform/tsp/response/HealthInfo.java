package com.vcyber.tspplatform.tsp.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/*
 * @author 李黎明
 * 健康状况
 */
@XStreamAlias("HEALTH_INFO")
public class HealthInfo {
	/*
	 * 血型
	 */
	@XStreamAlias("BLOOD_TYPE")
	private String blood_type;
	/*
	 * 身高
	 */
	@XStreamAlias("HEIGHT")
	private String height;
	/*
	 * 体重
	 */
	@XStreamAlias("WEIGHT")
	private String weight;
	/*
	 * 视力
	 */
	@XStreamAlias("SIGHT")
	private String sight;
	/*
	 * 病史
	 */
	@XStreamAlias("SICK_HISTOR")
	private String sick_history;
	/*
	 * 过敏史
	 */
	@XStreamAlias("ALLERGY_HISTORY")
	private String allergy_history;
	/*
	 * 常备医疗设备
	 */
	@XStreamAlias("MEDICAL_EQUIPMENT")
	private String medical_equipment;

	public String getBlood_type() {
		return blood_type;
	}

	public void setBlood_type(String blood_type) {
		this.blood_type = blood_type;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSight() {
		return sight;
	}

	public void setSight(String sight) {
		this.sight = sight;
	}

	public String getSick_history() {
		return sick_history;
	}

	public void setSick_history(String sick_history) {
		this.sick_history = sick_history;
	}

	public String getAllergy_history() {
		return allergy_history;
	}

	public void setAllergy_history(String allergy_history) {
		this.allergy_history = allergy_history;
	}

	public String getMedical_equipment() {
		return medical_equipment;
	}

	public void setMedical_equipment(String medical_equipment) {
		this.medical_equipment = medical_equipment;
	}


}
