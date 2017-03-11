package com.ycs.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ybinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ybinfo", catalog = "studentinfo")
public class Ybinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer selectId;
	private String photo;
	private String studyId;
	private String studentPass;
	private String studentName;
	private String namePy;
	private String sex;
	private String birthDay;
	private String national;
	private String polity;
	private String inTime;
	private String nativePlace;
	private String province;
	private String city;
	private String county;
	private String idCard;
	private String famillyReg;
	private String examineeType;
	private String getType1;
	private String examineeNo;
	private String unitSchool;
	private String oneCard;
	private String doctorNo;
	private String bankName;
	private String bankNo;
	private String bankAddress;
	private String unionpayNo;
	private String moveTel;
	private String email;
	private String qqcard;
	private String wxqcard;
	private String familyFlat;
	private String guardianName;
	private String guardianRelationship;
	private String guardianHarmony;
	private String guardianTel;
	private String guardianUnit;
	private String guardianName2;
	private String guardianRelationship2;
	private String guardianHarmony2;
	private String guardianTel2;
	private String guardianUnit2;
	private String familyAddress;
	private String famillyPost;
	private String famillyTel;
	private String campus;
	private String speType;
	private String inStatus;
	private String collegeNo;
	private String specialtyNo;
	private String grade;
	private String classNo;
	private String schoolYard;
	private String floorNo;
	private String dormAddress;
	private String ifDorm;
	private String outSchoolAdd;
	private String schoolMoney;
	private String houseMoney;
	private String cetnum;
	private String ncrenum;
	private String gridView5;
	private String gridView1;
	private String gridView3;
	private String gridView6;
	private String gridView10;
	private String gridView11;
	private String gridView4;
	private String gridView7;
	private String gridView16;
	private String gridView14;
	private String gridView2;
	private String otherThing;
	private String highHistory;

	// Constructors

	/** default constructor */
	public Ybinfo() {
	}

	/** full constructor */
	public Ybinfo(Integer selectId, String photo, String studyId,
			String studentPass, String studentName, String namePy, String sex,
			String birthDay, String national, String polity, String inTime,
			String nativePlace, String province, String city, String county,
			String idCard, String famillyReg, String examineeType,
			String getType1, String examineeNo, String unitSchool,
			String oneCard, String doctorNo, String bankName, String bankNo,
			String bankAddress, String unionpayNo, String moveTel,
			String email, String qqcard, String wxqcard, String familyFlat,
			String guardianName, String guardianRelationship,
			String guardianHarmony, String guardianTel, String guardianUnit,
			String guardianName2, String guardianRelationship2,
			String guardianHarmony2, String guardianTel2, String guardianUnit2,
			String familyAddress, String famillyPost, String famillyTel,
			String campus, String speType, String inStatus, String collegeNo,
			String specialtyNo, String grade, String classNo,
			String schoolYard, String floorNo, String dormAddress,
			String ifDorm, String outSchoolAdd, String schoolMoney,
			String houseMoney, String cetnum, String ncrenum, String gridView5,
			String gridView1, String gridView3, String gridView6,
			String gridView10, String gridView11, String gridView4,
			String gridView7, String gridView16, String gridView14,
			String gridView2, String otherThing, String highHistory) {
		this.selectId = selectId;
		this.photo = photo;
		this.studyId = studyId;
		this.studentPass = studentPass;
		this.studentName = studentName;
		this.namePy = namePy;
		this.sex = sex;
		this.birthDay = birthDay;
		this.national = national;
		this.polity = polity;
		this.inTime = inTime;
		this.nativePlace = nativePlace;
		this.province = province;
		this.city = city;
		this.county = county;
		this.idCard = idCard;
		this.famillyReg = famillyReg;
		this.examineeType = examineeType;
		this.getType1 = getType1;
		this.examineeNo = examineeNo;
		this.unitSchool = unitSchool;
		this.oneCard = oneCard;
		this.doctorNo = doctorNo;
		this.bankName = bankName;
		this.bankNo = bankNo;
		this.bankAddress = bankAddress;
		this.unionpayNo = unionpayNo;
		this.moveTel = moveTel;
		this.email = email;
		this.qqcard = qqcard;
		this.wxqcard = wxqcard;
		this.familyFlat = familyFlat;
		this.guardianName = guardianName;
		this.guardianRelationship = guardianRelationship;
		this.guardianHarmony = guardianHarmony;
		this.guardianTel = guardianTel;
		this.guardianUnit = guardianUnit;
		this.guardianName2 = guardianName2;
		this.guardianRelationship2 = guardianRelationship2;
		this.guardianHarmony2 = guardianHarmony2;
		this.guardianTel2 = guardianTel2;
		this.guardianUnit2 = guardianUnit2;
		this.familyAddress = familyAddress;
		this.famillyPost = famillyPost;
		this.famillyTel = famillyTel;
		this.campus = campus;
		this.speType = speType;
		this.inStatus = inStatus;
		this.collegeNo = collegeNo;
		this.specialtyNo = specialtyNo;
		this.grade = grade;
		this.classNo = classNo;
		this.schoolYard = schoolYard;
		this.floorNo = floorNo;
		this.dormAddress = dormAddress;
		this.ifDorm = ifDorm;
		this.outSchoolAdd = outSchoolAdd;
		this.schoolMoney = schoolMoney;
		this.houseMoney = houseMoney;
		this.cetnum = cetnum;
		this.ncrenum = ncrenum;
		this.gridView5 = gridView5;
		this.gridView1 = gridView1;
		this.gridView3 = gridView3;
		this.gridView6 = gridView6;
		this.gridView10 = gridView10;
		this.gridView11 = gridView11;
		this.gridView4 = gridView4;
		this.gridView7 = gridView7;
		this.gridView16 = gridView16;
		this.gridView14 = gridView14;
		this.gridView2 = gridView2;
		this.otherThing = otherThing;
		this.highHistory = highHistory;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "selectId")
	public Integer getSelectId() {
		return this.selectId;
	}

	public void setSelectId(Integer selectId) {
		this.selectId = selectId;
	}

	@Column(name = "photo")
	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "studyId")
	public String getStudyId() {
		return this.studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

	@Column(name = "studentPass")
	public String getStudentPass() {
		return this.studentPass;
	}

	public void setStudentPass(String studentPass) {
		this.studentPass = studentPass;
	}

	@Column(name = "studentName")
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Column(name = "namePY")
	public String getNamePy() {
		return this.namePy;
	}

	public void setNamePy(String namePy) {
		this.namePy = namePy;
	}

	@Column(name = "sex")
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "birthDay")
	public String getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Column(name = "national")
	public String getNational() {
		return this.national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	@Column(name = "polity")
	public String getPolity() {
		return this.polity;
	}

	public void setPolity(String polity) {
		this.polity = polity;
	}

	@Column(name = "inTime")
	public String getInTime() {
		return this.inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	@Column(name = "nativePlace")
	public String getNativePlace() {
		return this.nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	@Column(name = "province")
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "city")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "county")
	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	@Column(name = "idCard")
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "famillyReg")
	public String getFamillyReg() {
		return this.famillyReg;
	}

	public void setFamillyReg(String famillyReg) {
		this.famillyReg = famillyReg;
	}

	@Column(name = "examineeType")
	public String getExamineeType() {
		return this.examineeType;
	}

	public void setExamineeType(String examineeType) {
		this.examineeType = examineeType;
	}

	@Column(name = "getType1")
	public String getGetType1() {
		return this.getType1;
	}

	public void setGetType1(String getType1) {
		this.getType1 = getType1;
	}

	@Column(name = "examineeNo")
	public String getExamineeNo() {
		return this.examineeNo;
	}

	public void setExamineeNo(String examineeNo) {
		this.examineeNo = examineeNo;
	}

	@Column(name = "unitSchool")
	public String getUnitSchool() {
		return this.unitSchool;
	}

	public void setUnitSchool(String unitSchool) {
		this.unitSchool = unitSchool;
	}

	@Column(name = "oneCard")
	public String getOneCard() {
		return this.oneCard;
	}

	public void setOneCard(String oneCard) {
		this.oneCard = oneCard;
	}

	@Column(name = "doctorNo")
	public String getDoctorNo() {
		return this.doctorNo;
	}

	public void setDoctorNo(String doctorNo) {
		this.doctorNo = doctorNo;
	}

	@Column(name = "bankName")
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "bankNo")
	public String getBankNo() {
		return this.bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	@Column(name = "bankAddress")
	public String getBankAddress() {
		return this.bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	@Column(name = "unionpayNo")
	public String getUnionpayNo() {
		return this.unionpayNo;
	}

	public void setUnionpayNo(String unionpayNo) {
		this.unionpayNo = unionpayNo;
	}

	@Column(name = "moveTel")
	public String getMoveTel() {
		return this.moveTel;
	}

	public void setMoveTel(String moveTel) {
		this.moveTel = moveTel;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "QQCard")
	public String getQqcard() {
		return this.qqcard;
	}

	public void setQqcard(String qqcard) {
		this.qqcard = qqcard;
	}

	@Column(name = "WXQCard")
	public String getWxqcard() {
		return this.wxqcard;
	}

	public void setWxqcard(String wxqcard) {
		this.wxqcard = wxqcard;
	}

	@Column(name = "familyFlat")
	public String getFamilyFlat() {
		return this.familyFlat;
	}

	public void setFamilyFlat(String familyFlat) {
		this.familyFlat = familyFlat;
	}

	@Column(name = "guardianName")
	public String getGuardianName() {
		return this.guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	@Column(name = "guardianRelationship")
	public String getGuardianRelationship() {
		return this.guardianRelationship;
	}

	public void setGuardianRelationship(String guardianRelationship) {
		this.guardianRelationship = guardianRelationship;
	}

	@Column(name = "guardianHarmony")
	public String getGuardianHarmony() {
		return this.guardianHarmony;
	}

	public void setGuardianHarmony(String guardianHarmony) {
		this.guardianHarmony = guardianHarmony;
	}

	@Column(name = "guardianTel")
	public String getGuardianTel() {
		return this.guardianTel;
	}

	public void setGuardianTel(String guardianTel) {
		this.guardianTel = guardianTel;
	}

	@Column(name = "guardianUnit")
	public String getGuardianUnit() {
		return this.guardianUnit;
	}

	public void setGuardianUnit(String guardianUnit) {
		this.guardianUnit = guardianUnit;
	}

	@Column(name = "guardianName2")
	public String getGuardianName2() {
		return this.guardianName2;
	}

	public void setGuardianName2(String guardianName2) {
		this.guardianName2 = guardianName2;
	}

	@Column(name = "guardianRelationship2")
	public String getGuardianRelationship2() {
		return this.guardianRelationship2;
	}

	public void setGuardianRelationship2(String guardianRelationship2) {
		this.guardianRelationship2 = guardianRelationship2;
	}

	@Column(name = "guardianHarmony2")
	public String getGuardianHarmony2() {
		return this.guardianHarmony2;
	}

	public void setGuardianHarmony2(String guardianHarmony2) {
		this.guardianHarmony2 = guardianHarmony2;
	}

	@Column(name = "guardianTel2")
	public String getGuardianTel2() {
		return this.guardianTel2;
	}

	public void setGuardianTel2(String guardianTel2) {
		this.guardianTel2 = guardianTel2;
	}

	@Column(name = "guardianUnit2")
	public String getGuardianUnit2() {
		return this.guardianUnit2;
	}

	public void setGuardianUnit2(String guardianUnit2) {
		this.guardianUnit2 = guardianUnit2;
	}

	@Column(name = "familyAddress")
	public String getFamilyAddress() {
		return this.familyAddress;
	}

	public void setFamilyAddress(String familyAddress) {
		this.familyAddress = familyAddress;
	}

	@Column(name = "famillyPost")
	public String getFamillyPost() {
		return this.famillyPost;
	}

	public void setFamillyPost(String famillyPost) {
		this.famillyPost = famillyPost;
	}

	@Column(name = "famillyTel")
	public String getFamillyTel() {
		return this.famillyTel;
	}

	public void setFamillyTel(String famillyTel) {
		this.famillyTel = famillyTel;
	}

	@Column(name = "campus")
	public String getCampus() {
		return this.campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	@Column(name = "speType")
	public String getSpeType() {
		return this.speType;
	}

	public void setSpeType(String speType) {
		this.speType = speType;
	}

	@Column(name = "inStatus")
	public String getInStatus() {
		return this.inStatus;
	}

	public void setInStatus(String inStatus) {
		this.inStatus = inStatus;
	}

	@Column(name = "collegeNo")
	public String getCollegeNo() {
		return this.collegeNo;
	}

	public void setCollegeNo(String collegeNo) {
		this.collegeNo = collegeNo;
	}

	@Column(name = "specialtyNo")
	public String getSpecialtyNo() {
		return this.specialtyNo;
	}

	public void setSpecialtyNo(String specialtyNo) {
		this.specialtyNo = specialtyNo;
	}

	@Column(name = "grade")
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "classNo")
	public String getClassNo() {
		return this.classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	@Column(name = "schoolYard")
	public String getSchoolYard() {
		return this.schoolYard;
	}

	public void setSchoolYard(String schoolYard) {
		this.schoolYard = schoolYard;
	}

	@Column(name = "floorNo")
	public String getFloorNo() {
		return this.floorNo;
	}

	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}

	@Column(name = "dormAddress")
	public String getDormAddress() {
		return this.dormAddress;
	}

	public void setDormAddress(String dormAddress) {
		this.dormAddress = dormAddress;
	}

	@Column(name = "ifDorm")
	public String getIfDorm() {
		return this.ifDorm;
	}

	public void setIfDorm(String ifDorm) {
		this.ifDorm = ifDorm;
	}

	@Column(name = "outSchoolAdd")
	public String getOutSchoolAdd() {
		return this.outSchoolAdd;
	}

	public void setOutSchoolAdd(String outSchoolAdd) {
		this.outSchoolAdd = outSchoolAdd;
	}

	@Column(name = "schoolMoney")
	public String getSchoolMoney() {
		return this.schoolMoney;
	}

	public void setSchoolMoney(String schoolMoney) {
		this.schoolMoney = schoolMoney;
	}

	@Column(name = "houseMoney")
	public String getHouseMoney() {
		return this.houseMoney;
	}

	public void setHouseMoney(String houseMoney) {
		this.houseMoney = houseMoney;
	}

	@Column(name = "CETNum")
	public String getCetnum() {
		return this.cetnum;
	}

	public void setCetnum(String cetnum) {
		this.cetnum = cetnum;
	}

	@Column(name = "NCRENum")
	public String getNcrenum() {
		return this.ncrenum;
	}

	public void setNcrenum(String ncrenum) {
		this.ncrenum = ncrenum;
	}

	@Column(name = "gridView5")
	public String getGridView5() {
		return this.gridView5;
	}

	public void setGridView5(String gridView5) {
		this.gridView5 = gridView5;
	}

	@Column(name = "gridView1")
	public String getGridView1() {
		return this.gridView1;
	}

	public void setGridView1(String gridView1) {
		this.gridView1 = gridView1;
	}

	@Column(name = "gridView3")
	public String getGridView3() {
		return this.gridView3;
	}

	public void setGridView3(String gridView3) {
		this.gridView3 = gridView3;
	}

	@Column(name = "gridView6", length = 65535)
	public String getGridView6() {
		return this.gridView6;
	}

	public void setGridView6(String gridView6) {
		this.gridView6 = gridView6;
	}

	@Column(name = "gridView10")
	public String getGridView10() {
		return this.gridView10;
	}

	public void setGridView10(String gridView10) {
		this.gridView10 = gridView10;
	}

	@Column(name = "gridView11")
	public String getGridView11() {
		return this.gridView11;
	}

	public void setGridView11(String gridView11) {
		this.gridView11 = gridView11;
	}

	@Column(name = "gridView4")
	public String getGridView4() {
		return this.gridView4;
	}

	public void setGridView4(String gridView4) {
		this.gridView4 = gridView4;
	}

	@Column(name = "gridView7")
	public String getGridView7() {
		return this.gridView7;
	}

	public void setGridView7(String gridView7) {
		this.gridView7 = gridView7;
	}

	@Column(name = "gridView16")
	public String getGridView16() {
		return this.gridView16;
	}

	public void setGridView16(String gridView16) {
		this.gridView16 = gridView16;
	}

	@Column(name = "gridView14")
	public String getGridView14() {
		return this.gridView14;
	}

	public void setGridView14(String gridView14) {
		this.gridView14 = gridView14;
	}

	@Column(name = "gridView2")
	public String getGridView2() {
		return this.gridView2;
	}

	public void setGridView2(String gridView2) {
		this.gridView2 = gridView2;
	}

	@Column(name = "otherThing", length = 65535)
	public String getOtherThing() {
		return this.otherThing;
	}

	public void setOtherThing(String otherThing) {
		this.otherThing = otherThing;
	}

	@Column(name = "highHistory", length = 65535)
	public String getHighHistory() {
		return this.highHistory;
	}

	public void setHighHistory(String highHistory) {
		this.highHistory = highHistory;
	}

}