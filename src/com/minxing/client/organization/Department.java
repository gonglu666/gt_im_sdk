package com.minxing.client.organization;

import com.minxing.client.model.MxException;

import java.util.HashMap;

public class Department extends Organization {
	private long network_id; // 所在社区ID
	private String short_name; // 部门简称
	private String full_name; // 部门全名
	private String display_order; // 部门排序
	private String title; // 部门职务
	private String dept_code = "0"; // 部门编码
	private String parent_dept_code; // 父部门编码
	private Boolean root = false;

	private String network_name;
	private long id;
	private Integer level;
	private Long parent_dept_id = null;
	private String path;
	private String dept_type;
	private String ext1;
	private String abbreviation;
	//在通讯录中是否显示,默认显示
	private boolean showContacts = true;

	public String getNetwork_name() {
		return network_name;
	}

	public void setNetwork_name(String network_name) {
		this.network_name = network_name;
	}

	public long getNetworkId() {
		return network_id;
	}

	public void setNetworkId(long network_id) {
		this.network_id = network_id;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShortName(String short_name) {
		this.short_name = short_name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDisplay_order() {
		return display_order;
	}

	public void setDisplay_order(String display_order) {
		this.display_order = display_order;
	}

	public String getCode() {
		return dept_code;
	}

	public void setCode(String dept_code) {
		this.dept_code = dept_code;
	}

	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}

	public String getDept_code() {
		return this.dept_code;
	}

	public String getParent_dept_code() {
		return parent_dept_code;
	}

	public void setParent_dept_code(String parent_dept_code) {
		this.parent_dept_code = parent_dept_code;
	}

	public void setLevel(Integer _l) {
		if (_l == null)
			throw new MxException("level不能为空");
		this.level = _l;

	}

	public int getLeval() {
		if (this.level == null)
			return 0;
		return this.level;
	}

	public Long getParentDeptId() {
		return this.parent_dept_id;
	}

	public Boolean getRoot() {
		return root;
	}

	public void setRoot(Boolean root) {
		this.root = root;
	}

	public HashMap<String, String> toHash() {
		HashMap<String, String> params = new HashMap<String, String>();

		params.put("network_id", String.valueOf(this.getNetworkId()));
		params.put("short_name", this.getShort_name());
		params.put("full_name", this.getFull_name());
		params.put("display_order", this.getDisplay_order());
		params.put("dept_code", this.getCode());
		params.put("parent_dept_code", this.getParent_dept_code());
		params.put("root", this.getRoot().toString().toLowerCase());
		params.put("dept_id", String.valueOf(this.getId()));
		params.put("dept_type",this.getDept_type());
		params.put("ext1", this.getExt1());
		params.put("abbreviation",this.getAbbreviation());
		params.put("show_in_contacts",String.valueOf(this.isShowContacts()).toLowerCase());
		return params;
	}

	public void setId(long _id) {
		this.id = _id;

	}

	public long getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Department{" +
				"network_id=" + network_id +
				", short_name='" + short_name + '\'' +
				", full_name='" + full_name + '\'' +
				", display_order='" + display_order + '\'' +
				", title='" + title + '\'' +
				", dept_code='" + dept_code + '\'' +
				", parent_dept_code='" + parent_dept_code + '\'' +
				", root=" + root +
				", network_name='" + network_name + '\'' +
				", id=" + id +
				", level=" + level +
				", parent_dept_id=" + parent_dept_id +
				", path='" + path + '\'' +
				", dept_type='" + dept_type + '\'' +
				", ext1='" + ext1 + '\'' +
				", abbreviation='" + abbreviation + '\'' +
				", showContacts=" + showContacts +
				"} " + super.toString();
	}

	public void setParentDeptId(Long deptId) {
		this.parent_dept_id = deptId;

	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDept_type() {
		return dept_type;
	}

	public void setDept_type(String dept_type) {
		this.dept_type = dept_type;
	}

	public String getExt1() {
		return ext1;
	}

	public void setExt1(String ext1) {
		this.ext1 = ext1;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public boolean isShowContacts() {
		return showContacts;
	}

	public void setShowContacts(boolean showContacts) {
		this.showContacts = showContacts;
	}
}
