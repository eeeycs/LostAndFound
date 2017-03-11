package com.ycs.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ybregister entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ybregister", catalog = "studentinfo")
public class Ybregister implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer selectId;
	private String studentId;
	private String name;
	private String famillyReg;
	private String sex;
	private String nation;
	private String moveTel;
	private String collegeName;
	private String speName;
	private String speGrade;
	private String className;
	private String idCard;
	private String speType;
	private String oldName;
	private String comeType;
	private String height;
	private String weight;
	private String inCommunistParty;
	private String communistPartyIntroducer;
	private String inCommunistYouthLeague;
	private String communistYouthLeagueIntroducer;
	private String caucusJobStatus;
	private String awardOrPunishment;
	private String resumeStartEndTime1;
	private String resumeAddress1;
	private String resumeIntroducer1;
	private String resumeUnit1;
	private String resumeTel1;
	private String resumeStartEndTime2;
	private String resumeAddress2;
	private String resumeIntroducer2;
	private String resumeUnit2;
	private String resumeTel2;
	private String resumeStartEndTime3;
	private String resumeAddress3;
	private String resumeIntroducer3;
	private String resumeUnit3;
	private String resumeTel3;
	private String resumeStartEndTime4;
	private String resumeAddress4;
	private String resumeIntroducer4;
	private String resumeUnit4;
	private String resumeTel4;
	private String resumeStartEndTime5;
	private String resumeAddress5;
	private String resumeIntroducer5;
	private String resumeUnit5;
	private String resumeTel5;
	private String resumeStartEndTime6;
	private String resumeAddress6;
	private String resumeIntroducer6;
	private String resumeUnit6;
	private String resumeTel6;
	private String isMarry;
	private String loverName;
	private String loverPolitical;
	private String loverWorkInfo;
	private String fmemberAppellation1;
	private String fmemberName1;
	private String fmemberAge1;
	private String fmemberWorkInfo1;
	private String fmemberTel1;
	private String fmemberRelationship1;
	private String fmemberAppellation2;
	private String fmemberName2;
	private String fmemberAge2;
	private String fmemberWorkInfo2;
	private String fmemberTel2;
	private String fmemberRelationship2;
	private String fmemberAppellation3;
	private String fmemberName3;
	private String fmemberAge3;
	private String fmemberWorkInfo3;
	private String fmemberTel3;
	private String fmemberRelationship3;
	private String fmemberAppellation4;
	private String fmemberName4;
	private String fmemberAge4;
	private String fmemberWorkInfo4;
	private String fmemberTel4;
	private String fmemberRelationship4;
	private String fmemberAppellation5;
	private String fmemberName5;
	private String fmemberAge5;
	private String fmemberWorkInfo5;
	private String fmemberTel5;
	private String fmemberRelationship5;
	private String fmemberAppellation6;
	private String fmemberName6;
	private String fmemberAge6;
	private String fmemberWorkInfo6;
	private String fmemberTel6;
	private String fmemberRelationship6;
	private String fmemberAppellation7;
	private String fmemberName7;
	private String fmemberAge7;
	private String fmemberWorkInfo7;
	private String fmemberTel7;
	private String fmemberRelationship7;
	private String fmemberAppellation8;
	private String fmemberName8;
	private String fmemberAge8;
	private String fmemberWorkInfo8;
	private String fmemberTel8;
	private String fmemberRelationship8;
	private String familyTotalPersonNum;
	private String familyYearInCome;
	private String economicSources;
	private String leisureStyle;
	private String otherLeisureStyle;
	private String farthestCity;
	private String clothingBrand;
	private String appearanceScore;
	private String contactScore;
	private String selfConfidenceScore;
	private String hobby;
	private String monthlyMoney;
	private String remark;

	// Constructors

	/** default constructor */
	public Ybregister() {
	}

	/** full constructor */
	public Ybregister(Integer selectId, String studentId, String name,
			String famillyReg, String sex, String nation, String moveTel,
			String collegeName, String speName, String speGrade,
			String className, String idCard, String speType, String oldName,
			String comeType, String height, String weight,
			String inCommunistParty, String communistPartyIntroducer,
			String inCommunistYouthLeague,
			String communistYouthLeagueIntroducer, String caucusJobStatus,
			String awardOrPunishment, String resumeStartEndTime1,
			String resumeAddress1, String resumeIntroducer1,
			String resumeUnit1, String resumeTel1, String resumeStartEndTime2,
			String resumeAddress2, String resumeIntroducer2,
			String resumeUnit2, String resumeTel2, String resumeStartEndTime3,
			String resumeAddress3, String resumeIntroducer3,
			String resumeUnit3, String resumeTel3, String resumeStartEndTime4,
			String resumeAddress4, String resumeIntroducer4,
			String resumeUnit4, String resumeTel4, String resumeStartEndTime5,
			String resumeAddress5, String resumeIntroducer5,
			String resumeUnit5, String resumeTel5, String resumeStartEndTime6,
			String resumeAddress6, String resumeIntroducer6,
			String resumeUnit6, String resumeTel6, String isMarry,
			String loverName, String loverPolitical, String loverWorkInfo,
			String fmemberAppellation1, String fmemberName1,
			String fmemberAge1, String fmemberWorkInfo1, String fmemberTel1,
			String fmemberRelationship1, String fmemberAppellation2,
			String fmemberName2, String fmemberAge2, String fmemberWorkInfo2,
			String fmemberTel2, String fmemberRelationship2,
			String fmemberAppellation3, String fmemberName3,
			String fmemberAge3, String fmemberWorkInfo3, String fmemberTel3,
			String fmemberRelationship3, String fmemberAppellation4,
			String fmemberName4, String fmemberAge4, String fmemberWorkInfo4,
			String fmemberTel4, String fmemberRelationship4,
			String fmemberAppellation5, String fmemberName5,
			String fmemberAge5, String fmemberWorkInfo5, String fmemberTel5,
			String fmemberRelationship5, String fmemberAppellation6,
			String fmemberName6, String fmemberAge6, String fmemberWorkInfo6,
			String fmemberTel6, String fmemberRelationship6,
			String fmemberAppellation7, String fmemberName7,
			String fmemberAge7, String fmemberWorkInfo7, String fmemberTel7,
			String fmemberRelationship7, String fmemberAppellation8,
			String fmemberName8, String fmemberAge8, String fmemberWorkInfo8,
			String fmemberTel8, String fmemberRelationship8,
			String familyTotalPersonNum, String familyYearInCome,
			String economicSources, String leisureStyle,
			String otherLeisureStyle, String farthestCity,
			String clothingBrand, String appearanceScore, String contactScore,
			String selfConfidenceScore, String hobby, String monthlyMoney,
			String remark) {
		this.selectId = selectId;
		this.studentId = studentId;
		this.name = name;
		this.famillyReg = famillyReg;
		this.sex = sex;
		this.nation = nation;
		this.moveTel = moveTel;
		this.collegeName = collegeName;
		this.speName = speName;
		this.speGrade = speGrade;
		this.className = className;
		this.idCard = idCard;
		this.speType = speType;
		this.oldName = oldName;
		this.comeType = comeType;
		this.height = height;
		this.weight = weight;
		this.inCommunistParty = inCommunistParty;
		this.communistPartyIntroducer = communistPartyIntroducer;
		this.inCommunistYouthLeague = inCommunistYouthLeague;
		this.communistYouthLeagueIntroducer = communistYouthLeagueIntroducer;
		this.caucusJobStatus = caucusJobStatus;
		this.awardOrPunishment = awardOrPunishment;
		this.resumeStartEndTime1 = resumeStartEndTime1;
		this.resumeAddress1 = resumeAddress1;
		this.resumeIntroducer1 = resumeIntroducer1;
		this.resumeUnit1 = resumeUnit1;
		this.resumeTel1 = resumeTel1;
		this.resumeStartEndTime2 = resumeStartEndTime2;
		this.resumeAddress2 = resumeAddress2;
		this.resumeIntroducer2 = resumeIntroducer2;
		this.resumeUnit2 = resumeUnit2;
		this.resumeTel2 = resumeTel2;
		this.resumeStartEndTime3 = resumeStartEndTime3;
		this.resumeAddress3 = resumeAddress3;
		this.resumeIntroducer3 = resumeIntroducer3;
		this.resumeUnit3 = resumeUnit3;
		this.resumeTel3 = resumeTel3;
		this.resumeStartEndTime4 = resumeStartEndTime4;
		this.resumeAddress4 = resumeAddress4;
		this.resumeIntroducer4 = resumeIntroducer4;
		this.resumeUnit4 = resumeUnit4;
		this.resumeTel4 = resumeTel4;
		this.resumeStartEndTime5 = resumeStartEndTime5;
		this.resumeAddress5 = resumeAddress5;
		this.resumeIntroducer5 = resumeIntroducer5;
		this.resumeUnit5 = resumeUnit5;
		this.resumeTel5 = resumeTel5;
		this.resumeStartEndTime6 = resumeStartEndTime6;
		this.resumeAddress6 = resumeAddress6;
		this.resumeIntroducer6 = resumeIntroducer6;
		this.resumeUnit6 = resumeUnit6;
		this.resumeTel6 = resumeTel6;
		this.isMarry = isMarry;
		this.loverName = loverName;
		this.loverPolitical = loverPolitical;
		this.loverWorkInfo = loverWorkInfo;
		this.fmemberAppellation1 = fmemberAppellation1;
		this.fmemberName1 = fmemberName1;
		this.fmemberAge1 = fmemberAge1;
		this.fmemberWorkInfo1 = fmemberWorkInfo1;
		this.fmemberTel1 = fmemberTel1;
		this.fmemberRelationship1 = fmemberRelationship1;
		this.fmemberAppellation2 = fmemberAppellation2;
		this.fmemberName2 = fmemberName2;
		this.fmemberAge2 = fmemberAge2;
		this.fmemberWorkInfo2 = fmemberWorkInfo2;
		this.fmemberTel2 = fmemberTel2;
		this.fmemberRelationship2 = fmemberRelationship2;
		this.fmemberAppellation3 = fmemberAppellation3;
		this.fmemberName3 = fmemberName3;
		this.fmemberAge3 = fmemberAge3;
		this.fmemberWorkInfo3 = fmemberWorkInfo3;
		this.fmemberTel3 = fmemberTel3;
		this.fmemberRelationship3 = fmemberRelationship3;
		this.fmemberAppellation4 = fmemberAppellation4;
		this.fmemberName4 = fmemberName4;
		this.fmemberAge4 = fmemberAge4;
		this.fmemberWorkInfo4 = fmemberWorkInfo4;
		this.fmemberTel4 = fmemberTel4;
		this.fmemberRelationship4 = fmemberRelationship4;
		this.fmemberAppellation5 = fmemberAppellation5;
		this.fmemberName5 = fmemberName5;
		this.fmemberAge5 = fmemberAge5;
		this.fmemberWorkInfo5 = fmemberWorkInfo5;
		this.fmemberTel5 = fmemberTel5;
		this.fmemberRelationship5 = fmemberRelationship5;
		this.fmemberAppellation6 = fmemberAppellation6;
		this.fmemberName6 = fmemberName6;
		this.fmemberAge6 = fmemberAge6;
		this.fmemberWorkInfo6 = fmemberWorkInfo6;
		this.fmemberTel6 = fmemberTel6;
		this.fmemberRelationship6 = fmemberRelationship6;
		this.fmemberAppellation7 = fmemberAppellation7;
		this.fmemberName7 = fmemberName7;
		this.fmemberAge7 = fmemberAge7;
		this.fmemberWorkInfo7 = fmemberWorkInfo7;
		this.fmemberTel7 = fmemberTel7;
		this.fmemberRelationship7 = fmemberRelationship7;
		this.fmemberAppellation8 = fmemberAppellation8;
		this.fmemberName8 = fmemberName8;
		this.fmemberAge8 = fmemberAge8;
		this.fmemberWorkInfo8 = fmemberWorkInfo8;
		this.fmemberTel8 = fmemberTel8;
		this.fmemberRelationship8 = fmemberRelationship8;
		this.familyTotalPersonNum = familyTotalPersonNum;
		this.familyYearInCome = familyYearInCome;
		this.economicSources = economicSources;
		this.leisureStyle = leisureStyle;
		this.otherLeisureStyle = otherLeisureStyle;
		this.farthestCity = farthestCity;
		this.clothingBrand = clothingBrand;
		this.appearanceScore = appearanceScore;
		this.contactScore = contactScore;
		this.selfConfidenceScore = selfConfidenceScore;
		this.hobby = hobby;
		this.monthlyMoney = monthlyMoney;
		this.remark = remark;
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

	@Column(name = "studentId", length = 32)
	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Column(name = "name", length = 32)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "famillyReg", length = 32)
	public String getFamillyReg() {
		return this.famillyReg;
	}

	public void setFamillyReg(String famillyReg) {
		this.famillyReg = famillyReg;
	}

	@Column(name = "sex", length = 32)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "nation", length = 32)
	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	@Column(name = "moveTel", length = 32)
	public String getMoveTel() {
		return this.moveTel;
	}

	public void setMoveTel(String moveTel) {
		this.moveTel = moveTel;
	}

	@Column(name = "collegeName", length = 32)
	public String getCollegeName() {
		return this.collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Column(name = "speName", length = 32)
	public String getSpeName() {
		return this.speName;
	}

	public void setSpeName(String speName) {
		this.speName = speName;
	}

	@Column(name = "speGrade", length = 32)
	public String getSpeGrade() {
		return this.speGrade;
	}

	public void setSpeGrade(String speGrade) {
		this.speGrade = speGrade;
	}

	@Column(name = "className", length = 32)
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Column(name = "idCard", length = 32)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "speType", length = 32)
	public String getSpeType() {
		return this.speType;
	}

	public void setSpeType(String speType) {
		this.speType = speType;
	}

	@Column(name = "oldName", length = 32)
	public String getOldName() {
		return this.oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	@Column(name = "comeType", length = 32)
	public String getComeType() {
		return this.comeType;
	}

	public void setComeType(String comeType) {
		this.comeType = comeType;
	}

	@Column(name = "height", length = 32)
	public String getHeight() {
		return this.height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	@Column(name = "weight", length = 32)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "inCommunistParty", length = 32)
	public String getInCommunistParty() {
		return this.inCommunistParty;
	}

	public void setInCommunistParty(String inCommunistParty) {
		this.inCommunistParty = inCommunistParty;
	}

	@Column(name = "communistPartyIntroducer", length = 32)
	public String getCommunistPartyIntroducer() {
		return this.communistPartyIntroducer;
	}

	public void setCommunistPartyIntroducer(String communistPartyIntroducer) {
		this.communistPartyIntroducer = communistPartyIntroducer;
	}

	@Column(name = "inCommunistYouthLeague", length = 32)
	public String getInCommunistYouthLeague() {
		return this.inCommunistYouthLeague;
	}

	public void setInCommunistYouthLeague(String inCommunistYouthLeague) {
		this.inCommunistYouthLeague = inCommunistYouthLeague;
	}

	@Column(name = "communistYouthLeagueIntroducer", length = 32)
	public String getCommunistYouthLeagueIntroducer() {
		return this.communistYouthLeagueIntroducer;
	}

	public void setCommunistYouthLeagueIntroducer(
			String communistYouthLeagueIntroducer) {
		this.communistYouthLeagueIntroducer = communistYouthLeagueIntroducer;
	}

	@Column(name = "caucusJobStatus")
	public String getCaucusJobStatus() {
		return this.caucusJobStatus;
	}

	public void setCaucusJobStatus(String caucusJobStatus) {
		this.caucusJobStatus = caucusJobStatus;
	}

	@Column(name = "awardOrPunishment")
	public String getAwardOrPunishment() {
		return this.awardOrPunishment;
	}

	public void setAwardOrPunishment(String awardOrPunishment) {
		this.awardOrPunishment = awardOrPunishment;
	}

	@Column(name = "resumeStartEndTime1", length = 32)
	public String getResumeStartEndTime1() {
		return this.resumeStartEndTime1;
	}

	public void setResumeStartEndTime1(String resumeStartEndTime1) {
		this.resumeStartEndTime1 = resumeStartEndTime1;
	}

	@Column(name = "resumeAddress1", length = 32)
	public String getResumeAddress1() {
		return this.resumeAddress1;
	}

	public void setResumeAddress1(String resumeAddress1) {
		this.resumeAddress1 = resumeAddress1;
	}

	@Column(name = "resumeIntroducer1", length = 32)
	public String getResumeIntroducer1() {
		return this.resumeIntroducer1;
	}

	public void setResumeIntroducer1(String resumeIntroducer1) {
		this.resumeIntroducer1 = resumeIntroducer1;
	}

	@Column(name = "resumeUnit1", length = 32)
	public String getResumeUnit1() {
		return this.resumeUnit1;
	}

	public void setResumeUnit1(String resumeUnit1) {
		this.resumeUnit1 = resumeUnit1;
	}

	@Column(name = "resumeTel1", length = 32)
	public String getResumeTel1() {
		return this.resumeTel1;
	}

	public void setResumeTel1(String resumeTel1) {
		this.resumeTel1 = resumeTel1;
	}

	@Column(name = "resumeStartEndTime2", length = 32)
	public String getResumeStartEndTime2() {
		return this.resumeStartEndTime2;
	}

	public void setResumeStartEndTime2(String resumeStartEndTime2) {
		this.resumeStartEndTime2 = resumeStartEndTime2;
	}

	@Column(name = "resumeAddress2", length = 32)
	public String getResumeAddress2() {
		return this.resumeAddress2;
	}

	public void setResumeAddress2(String resumeAddress2) {
		this.resumeAddress2 = resumeAddress2;
	}

	@Column(name = "resumeIntroducer2", length = 32)
	public String getResumeIntroducer2() {
		return this.resumeIntroducer2;
	}

	public void setResumeIntroducer2(String resumeIntroducer2) {
		this.resumeIntroducer2 = resumeIntroducer2;
	}

	@Column(name = "resumeUnit2", length = 32)
	public String getResumeUnit2() {
		return this.resumeUnit2;
	}

	public void setResumeUnit2(String resumeUnit2) {
		this.resumeUnit2 = resumeUnit2;
	}

	@Column(name = "resumeTel2", length = 32)
	public String getResumeTel2() {
		return this.resumeTel2;
	}

	public void setResumeTel2(String resumeTel2) {
		this.resumeTel2 = resumeTel2;
	}

	@Column(name = "resumeStartEndTime3", length = 32)
	public String getResumeStartEndTime3() {
		return this.resumeStartEndTime3;
	}

	public void setResumeStartEndTime3(String resumeStartEndTime3) {
		this.resumeStartEndTime3 = resumeStartEndTime3;
	}

	@Column(name = "resumeAddress3", length = 32)
	public String getResumeAddress3() {
		return this.resumeAddress3;
	}

	public void setResumeAddress3(String resumeAddress3) {
		this.resumeAddress3 = resumeAddress3;
	}

	@Column(name = "resumeIntroducer3", length = 32)
	public String getResumeIntroducer3() {
		return this.resumeIntroducer3;
	}

	public void setResumeIntroducer3(String resumeIntroducer3) {
		this.resumeIntroducer3 = resumeIntroducer3;
	}

	@Column(name = "resumeUnit3", length = 32)
	public String getResumeUnit3() {
		return this.resumeUnit3;
	}

	public void setResumeUnit3(String resumeUnit3) {
		this.resumeUnit3 = resumeUnit3;
	}

	@Column(name = "resumeTel3", length = 32)
	public String getResumeTel3() {
		return this.resumeTel3;
	}

	public void setResumeTel3(String resumeTel3) {
		this.resumeTel3 = resumeTel3;
	}

	@Column(name = "resumeStartEndTime4", length = 32)
	public String getResumeStartEndTime4() {
		return this.resumeStartEndTime4;
	}

	public void setResumeStartEndTime4(String resumeStartEndTime4) {
		this.resumeStartEndTime4 = resumeStartEndTime4;
	}

	@Column(name = "resumeAddress4", length = 32)
	public String getResumeAddress4() {
		return this.resumeAddress4;
	}

	public void setResumeAddress4(String resumeAddress4) {
		this.resumeAddress4 = resumeAddress4;
	}

	@Column(name = "resumeIntroducer4", length = 32)
	public String getResumeIntroducer4() {
		return this.resumeIntroducer4;
	}

	public void setResumeIntroducer4(String resumeIntroducer4) {
		this.resumeIntroducer4 = resumeIntroducer4;
	}

	@Column(name = "resumeUnit4", length = 32)
	public String getResumeUnit4() {
		return this.resumeUnit4;
	}

	public void setResumeUnit4(String resumeUnit4) {
		this.resumeUnit4 = resumeUnit4;
	}

	@Column(name = "resumeTel4", length = 32)
	public String getResumeTel4() {
		return this.resumeTel4;
	}

	public void setResumeTel4(String resumeTel4) {
		this.resumeTel4 = resumeTel4;
	}

	@Column(name = "resumeStartEndTime5", length = 32)
	public String getResumeStartEndTime5() {
		return this.resumeStartEndTime5;
	}

	public void setResumeStartEndTime5(String resumeStartEndTime5) {
		this.resumeStartEndTime5 = resumeStartEndTime5;
	}

	@Column(name = "resumeAddress5", length = 32)
	public String getResumeAddress5() {
		return this.resumeAddress5;
	}

	public void setResumeAddress5(String resumeAddress5) {
		this.resumeAddress5 = resumeAddress5;
	}

	@Column(name = "resumeIntroducer5", length = 32)
	public String getResumeIntroducer5() {
		return this.resumeIntroducer5;
	}

	public void setResumeIntroducer5(String resumeIntroducer5) {
		this.resumeIntroducer5 = resumeIntroducer5;
	}

	@Column(name = "resumeUnit5", length = 32)
	public String getResumeUnit5() {
		return this.resumeUnit5;
	}

	public void setResumeUnit5(String resumeUnit5) {
		this.resumeUnit5 = resumeUnit5;
	}

	@Column(name = "resumeTel5", length = 32)
	public String getResumeTel5() {
		return this.resumeTel5;
	}

	public void setResumeTel5(String resumeTel5) {
		this.resumeTel5 = resumeTel5;
	}

	@Column(name = "resumeStartEndTime6", length = 32)
	public String getResumeStartEndTime6() {
		return this.resumeStartEndTime6;
	}

	public void setResumeStartEndTime6(String resumeStartEndTime6) {
		this.resumeStartEndTime6 = resumeStartEndTime6;
	}

	@Column(name = "resumeAddress6", length = 32)
	public String getResumeAddress6() {
		return this.resumeAddress6;
	}

	public void setResumeAddress6(String resumeAddress6) {
		this.resumeAddress6 = resumeAddress6;
	}

	@Column(name = "resumeIntroducer6", length = 32)
	public String getResumeIntroducer6() {
		return this.resumeIntroducer6;
	}

	public void setResumeIntroducer6(String resumeIntroducer6) {
		this.resumeIntroducer6 = resumeIntroducer6;
	}

	@Column(name = "resumeUnit6", length = 32)
	public String getResumeUnit6() {
		return this.resumeUnit6;
	}

	public void setResumeUnit6(String resumeUnit6) {
		this.resumeUnit6 = resumeUnit6;
	}

	@Column(name = "resumeTel6", length = 32)
	public String getResumeTel6() {
		return this.resumeTel6;
	}

	public void setResumeTel6(String resumeTel6) {
		this.resumeTel6 = resumeTel6;
	}

	@Column(name = "isMarry", length = 32)
	public String getIsMarry() {
		return this.isMarry;
	}

	public void setIsMarry(String isMarry) {
		this.isMarry = isMarry;
	}

	@Column(name = "loverName", length = 32)
	public String getLoverName() {
		return this.loverName;
	}

	public void setLoverName(String loverName) {
		this.loverName = loverName;
	}

	@Column(name = "loverPolitical", length = 32)
	public String getLoverPolitical() {
		return this.loverPolitical;
	}

	public void setLoverPolitical(String loverPolitical) {
		this.loverPolitical = loverPolitical;
	}

	@Column(name = "loverWorkInfo", length = 32)
	public String getLoverWorkInfo() {
		return this.loverWorkInfo;
	}

	public void setLoverWorkInfo(String loverWorkInfo) {
		this.loverWorkInfo = loverWorkInfo;
	}

	@Column(name = "fMemberAppellation1", length = 32)
	public String getFmemberAppellation1() {
		return this.fmemberAppellation1;
	}

	public void setFmemberAppellation1(String fmemberAppellation1) {
		this.fmemberAppellation1 = fmemberAppellation1;
	}

	@Column(name = "fMemberName1", length = 32)
	public String getFmemberName1() {
		return this.fmemberName1;
	}

	public void setFmemberName1(String fmemberName1) {
		this.fmemberName1 = fmemberName1;
	}

	@Column(name = "fMemberAge1", length = 32)
	public String getFmemberAge1() {
		return this.fmemberAge1;
	}

	public void setFmemberAge1(String fmemberAge1) {
		this.fmemberAge1 = fmemberAge1;
	}

	@Column(name = "fMemberWorkInfo1", length = 32)
	public String getFmemberWorkInfo1() {
		return this.fmemberWorkInfo1;
	}

	public void setFmemberWorkInfo1(String fmemberWorkInfo1) {
		this.fmemberWorkInfo1 = fmemberWorkInfo1;
	}

	@Column(name = "fMemberTel1", length = 32)
	public String getFmemberTel1() {
		return this.fmemberTel1;
	}

	public void setFmemberTel1(String fmemberTel1) {
		this.fmemberTel1 = fmemberTel1;
	}

	@Column(name = "fMemberRelationship1", length = 32)
	public String getFmemberRelationship1() {
		return this.fmemberRelationship1;
	}

	public void setFmemberRelationship1(String fmemberRelationship1) {
		this.fmemberRelationship1 = fmemberRelationship1;
	}

	@Column(name = "fMemberAppellation2", length = 32)
	public String getFmemberAppellation2() {
		return this.fmemberAppellation2;
	}

	public void setFmemberAppellation2(String fmemberAppellation2) {
		this.fmemberAppellation2 = fmemberAppellation2;
	}

	@Column(name = "fMemberName2", length = 32)
	public String getFmemberName2() {
		return this.fmemberName2;
	}

	public void setFmemberName2(String fmemberName2) {
		this.fmemberName2 = fmemberName2;
	}

	@Column(name = "fMemberAge2", length = 32)
	public String getFmemberAge2() {
		return this.fmemberAge2;
	}

	public void setFmemberAge2(String fmemberAge2) {
		this.fmemberAge2 = fmemberAge2;
	}

	@Column(name = "fMemberWorkInfo2", length = 32)
	public String getFmemberWorkInfo2() {
		return this.fmemberWorkInfo2;
	}

	public void setFmemberWorkInfo2(String fmemberWorkInfo2) {
		this.fmemberWorkInfo2 = fmemberWorkInfo2;
	}

	@Column(name = "fMemberTel2", length = 32)
	public String getFmemberTel2() {
		return this.fmemberTel2;
	}

	public void setFmemberTel2(String fmemberTel2) {
		this.fmemberTel2 = fmemberTel2;
	}

	@Column(name = "fMemberRelationship2", length = 32)
	public String getFmemberRelationship2() {
		return this.fmemberRelationship2;
	}

	public void setFmemberRelationship2(String fmemberRelationship2) {
		this.fmemberRelationship2 = fmemberRelationship2;
	}

	@Column(name = "fMemberAppellation3", length = 32)
	public String getFmemberAppellation3() {
		return this.fmemberAppellation3;
	}

	public void setFmemberAppellation3(String fmemberAppellation3) {
		this.fmemberAppellation3 = fmemberAppellation3;
	}

	@Column(name = "fMemberName3", length = 32)
	public String getFmemberName3() {
		return this.fmemberName3;
	}

	public void setFmemberName3(String fmemberName3) {
		this.fmemberName3 = fmemberName3;
	}

	@Column(name = "fMemberAge3", length = 32)
	public String getFmemberAge3() {
		return this.fmemberAge3;
	}

	public void setFmemberAge3(String fmemberAge3) {
		this.fmemberAge3 = fmemberAge3;
	}

	@Column(name = "fMemberWorkInfo3", length = 32)
	public String getFmemberWorkInfo3() {
		return this.fmemberWorkInfo3;
	}

	public void setFmemberWorkInfo3(String fmemberWorkInfo3) {
		this.fmemberWorkInfo3 = fmemberWorkInfo3;
	}

	@Column(name = "fMemberTel3", length = 32)
	public String getFmemberTel3() {
		return this.fmemberTel3;
	}

	public void setFmemberTel3(String fmemberTel3) {
		this.fmemberTel3 = fmemberTel3;
	}

	@Column(name = "fMemberRelationship3", length = 32)
	public String getFmemberRelationship3() {
		return this.fmemberRelationship3;
	}

	public void setFmemberRelationship3(String fmemberRelationship3) {
		this.fmemberRelationship3 = fmemberRelationship3;
	}

	@Column(name = "fMemberAppellation4", length = 32)
	public String getFmemberAppellation4() {
		return this.fmemberAppellation4;
	}

	public void setFmemberAppellation4(String fmemberAppellation4) {
		this.fmemberAppellation4 = fmemberAppellation4;
	}

	@Column(name = "fMemberName4", length = 32)
	public String getFmemberName4() {
		return this.fmemberName4;
	}

	public void setFmemberName4(String fmemberName4) {
		this.fmemberName4 = fmemberName4;
	}

	@Column(name = "fMemberAge4", length = 32)
	public String getFmemberAge4() {
		return this.fmemberAge4;
	}

	public void setFmemberAge4(String fmemberAge4) {
		this.fmemberAge4 = fmemberAge4;
	}

	@Column(name = "fMemberWorkInfo4", length = 32)
	public String getFmemberWorkInfo4() {
		return this.fmemberWorkInfo4;
	}

	public void setFmemberWorkInfo4(String fmemberWorkInfo4) {
		this.fmemberWorkInfo4 = fmemberWorkInfo4;
	}

	@Column(name = "fMemberTel4", length = 32)
	public String getFmemberTel4() {
		return this.fmemberTel4;
	}

	public void setFmemberTel4(String fmemberTel4) {
		this.fmemberTel4 = fmemberTel4;
	}

	@Column(name = "fMemberRelationship4", length = 32)
	public String getFmemberRelationship4() {
		return this.fmemberRelationship4;
	}

	public void setFmemberRelationship4(String fmemberRelationship4) {
		this.fmemberRelationship4 = fmemberRelationship4;
	}

	@Column(name = "fMemberAppellation5", length = 32)
	public String getFmemberAppellation5() {
		return this.fmemberAppellation5;
	}

	public void setFmemberAppellation5(String fmemberAppellation5) {
		this.fmemberAppellation5 = fmemberAppellation5;
	}

	@Column(name = "fMemberName5", length = 32)
	public String getFmemberName5() {
		return this.fmemberName5;
	}

	public void setFmemberName5(String fmemberName5) {
		this.fmemberName5 = fmemberName5;
	}

	@Column(name = "fMemberAge5", length = 32)
	public String getFmemberAge5() {
		return this.fmemberAge5;
	}

	public void setFmemberAge5(String fmemberAge5) {
		this.fmemberAge5 = fmemberAge5;
	}

	@Column(name = "fMemberWorkInfo5", length = 32)
	public String getFmemberWorkInfo5() {
		return this.fmemberWorkInfo5;
	}

	public void setFmemberWorkInfo5(String fmemberWorkInfo5) {
		this.fmemberWorkInfo5 = fmemberWorkInfo5;
	}

	@Column(name = "fMemberTel5", length = 32)
	public String getFmemberTel5() {
		return this.fmemberTel5;
	}

	public void setFmemberTel5(String fmemberTel5) {
		this.fmemberTel5 = fmemberTel5;
	}

	@Column(name = "fMemberRelationship5", length = 32)
	public String getFmemberRelationship5() {
		return this.fmemberRelationship5;
	}

	public void setFmemberRelationship5(String fmemberRelationship5) {
		this.fmemberRelationship5 = fmemberRelationship5;
	}

	@Column(name = "fMemberAppellation6", length = 32)
	public String getFmemberAppellation6() {
		return this.fmemberAppellation6;
	}

	public void setFmemberAppellation6(String fmemberAppellation6) {
		this.fmemberAppellation6 = fmemberAppellation6;
	}

	@Column(name = "fMemberName6", length = 32)
	public String getFmemberName6() {
		return this.fmemberName6;
	}

	public void setFmemberName6(String fmemberName6) {
		this.fmemberName6 = fmemberName6;
	}

	@Column(name = "fMemberAge6", length = 32)
	public String getFmemberAge6() {
		return this.fmemberAge6;
	}

	public void setFmemberAge6(String fmemberAge6) {
		this.fmemberAge6 = fmemberAge6;
	}

	@Column(name = "fMemberWorkInfo6", length = 32)
	public String getFmemberWorkInfo6() {
		return this.fmemberWorkInfo6;
	}

	public void setFmemberWorkInfo6(String fmemberWorkInfo6) {
		this.fmemberWorkInfo6 = fmemberWorkInfo6;
	}

	@Column(name = "fMemberTel6", length = 32)
	public String getFmemberTel6() {
		return this.fmemberTel6;
	}

	public void setFmemberTel6(String fmemberTel6) {
		this.fmemberTel6 = fmemberTel6;
	}

	@Column(name = "fMemberRelationship6", length = 32)
	public String getFmemberRelationship6() {
		return this.fmemberRelationship6;
	}

	public void setFmemberRelationship6(String fmemberRelationship6) {
		this.fmemberRelationship6 = fmemberRelationship6;
	}

	@Column(name = "fMemberAppellation7", length = 32)
	public String getFmemberAppellation7() {
		return this.fmemberAppellation7;
	}

	public void setFmemberAppellation7(String fmemberAppellation7) {
		this.fmemberAppellation7 = fmemberAppellation7;
	}

	@Column(name = "fMemberName7", length = 32)
	public String getFmemberName7() {
		return this.fmemberName7;
	}

	public void setFmemberName7(String fmemberName7) {
		this.fmemberName7 = fmemberName7;
	}

	@Column(name = "fMemberAge7", length = 32)
	public String getFmemberAge7() {
		return this.fmemberAge7;
	}

	public void setFmemberAge7(String fmemberAge7) {
		this.fmemberAge7 = fmemberAge7;
	}

	@Column(name = "fMemberWorkInfo7", length = 32)
	public String getFmemberWorkInfo7() {
		return this.fmemberWorkInfo7;
	}

	public void setFmemberWorkInfo7(String fmemberWorkInfo7) {
		this.fmemberWorkInfo7 = fmemberWorkInfo7;
	}

	@Column(name = "fMemberTel7", length = 32)
	public String getFmemberTel7() {
		return this.fmemberTel7;
	}

	public void setFmemberTel7(String fmemberTel7) {
		this.fmemberTel7 = fmemberTel7;
	}

	@Column(name = "fMemberRelationship7", length = 32)
	public String getFmemberRelationship7() {
		return this.fmemberRelationship7;
	}

	public void setFmemberRelationship7(String fmemberRelationship7) {
		this.fmemberRelationship7 = fmemberRelationship7;
	}

	@Column(name = "fMemberAppellation8", length = 32)
	public String getFmemberAppellation8() {
		return this.fmemberAppellation8;
	}

	public void setFmemberAppellation8(String fmemberAppellation8) {
		this.fmemberAppellation8 = fmemberAppellation8;
	}

	@Column(name = "fMemberName8", length = 32)
	public String getFmemberName8() {
		return this.fmemberName8;
	}

	public void setFmemberName8(String fmemberName8) {
		this.fmemberName8 = fmemberName8;
	}

	@Column(name = "fMemberAge8", length = 32)
	public String getFmemberAge8() {
		return this.fmemberAge8;
	}

	public void setFmemberAge8(String fmemberAge8) {
		this.fmemberAge8 = fmemberAge8;
	}

	@Column(name = "fMemberWorkInfo8", length = 32)
	public String getFmemberWorkInfo8() {
		return this.fmemberWorkInfo8;
	}

	public void setFmemberWorkInfo8(String fmemberWorkInfo8) {
		this.fmemberWorkInfo8 = fmemberWorkInfo8;
	}

	@Column(name = "fMemberTel8", length = 32)
	public String getFmemberTel8() {
		return this.fmemberTel8;
	}

	public void setFmemberTel8(String fmemberTel8) {
		this.fmemberTel8 = fmemberTel8;
	}

	@Column(name = "fMemberRelationship8", length = 32)
	public String getFmemberRelationship8() {
		return this.fmemberRelationship8;
	}

	public void setFmemberRelationship8(String fmemberRelationship8) {
		this.fmemberRelationship8 = fmemberRelationship8;
	}

	@Column(name = "familyTotalPersonNum", length = 32)
	public String getFamilyTotalPersonNum() {
		return this.familyTotalPersonNum;
	}

	public void setFamilyTotalPersonNum(String familyTotalPersonNum) {
		this.familyTotalPersonNum = familyTotalPersonNum;
	}

	@Column(name = "familyYearInCome", length = 32)
	public String getFamilyYearInCome() {
		return this.familyYearInCome;
	}

	public void setFamilyYearInCome(String familyYearInCome) {
		this.familyYearInCome = familyYearInCome;
	}

	@Column(name = "economicSources")
	public String getEconomicSources() {
		return this.economicSources;
	}

	public void setEconomicSources(String economicSources) {
		this.economicSources = economicSources;
	}

	@Column(name = "leisureStyle")
	public String getLeisureStyle() {
		return this.leisureStyle;
	}

	public void setLeisureStyle(String leisureStyle) {
		this.leisureStyle = leisureStyle;
	}

	@Column(name = "otherLeisureStyle", length = 32)
	public String getOtherLeisureStyle() {
		return this.otherLeisureStyle;
	}

	public void setOtherLeisureStyle(String otherLeisureStyle) {
		this.otherLeisureStyle = otherLeisureStyle;
	}

	@Column(name = "farthestCity", length = 32)
	public String getFarthestCity() {
		return this.farthestCity;
	}

	public void setFarthestCity(String farthestCity) {
		this.farthestCity = farthestCity;
	}

	@Column(name = "clothingBrand", length = 32)
	public String getClothingBrand() {
		return this.clothingBrand;
	}

	public void setClothingBrand(String clothingBrand) {
		this.clothingBrand = clothingBrand;
	}

	@Column(name = "appearanceScore", length = 32)
	public String getAppearanceScore() {
		return this.appearanceScore;
	}

	public void setAppearanceScore(String appearanceScore) {
		this.appearanceScore = appearanceScore;
	}

	@Column(name = "contactScore", length = 32)
	public String getContactScore() {
		return this.contactScore;
	}

	public void setContactScore(String contactScore) {
		this.contactScore = contactScore;
	}

	@Column(name = "selfConfidenceScore", length = 32)
	public String getSelfConfidenceScore() {
		return this.selfConfidenceScore;
	}

	public void setSelfConfidenceScore(String selfConfidenceScore) {
		this.selfConfidenceScore = selfConfidenceScore;
	}

	@Column(name = "hobby")
	public String getHobby() {
		return this.hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Column(name = "monthlyMoney", length = 32)
	public String getMonthlyMoney() {
		return this.monthlyMoney;
	}

	public void setMonthlyMoney(String monthlyMoney) {
		this.monthlyMoney = monthlyMoney;
	}

	@Column(name = "remark", length = 260)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return String
				.format("Ybregister [id=%s, selectId=%s, studentId=%s, name=%s, famillyReg=%s, sex=%s, nation=%s, moveTel=%s, collegeName=%s, speName=%s, speGrade=%s, className=%s, idCard=%s, speType=%s, oldName=%s, comeType=%s, height=%s, weight=%s, inCommunistParty=%s, communistPartyIntroducer=%s, inCommunistYouthLeague=%s, communistYouthLeagueIntroducer=%s, caucusJobStatus=%s, awardOrPunishment=%s, resumeStartEndTime1=%s, resumeAddress1=%s, resumeIntroducer1=%s, resumeUnit1=%s, resumeTel1=%s, resumeStartEndTime2=%s, resumeAddress2=%s, resumeIntroducer2=%s, resumeUnit2=%s, resumeTel2=%s, resumeStartEndTime3=%s, resumeAddress3=%s, resumeIntroducer3=%s, resumeUnit3=%s, resumeTel3=%s, resumeStartEndTime4=%s, resumeAddress4=%s, resumeIntroducer4=%s, resumeUnit4=%s, resumeTel4=%s, resumeStartEndTime5=%s, resumeAddress5=%s, resumeIntroducer5=%s, resumeUnit5=%s, resumeTel5=%s, resumeStartEndTime6=%s, resumeAddress6=%s, resumeIntroducer6=%s, resumeUnit6=%s, resumeTel6=%s, isMarry=%s, loverName=%s, loverPolitical=%s, loverWorkInfo=%s, fmemberAppellation1=%s, fmemberName1=%s, fmemberAge1=%s, fmemberWorkInfo1=%s, fmemberTel1=%s, fmemberRelationship1=%s, fmemberAppellation2=%s, fmemberName2=%s, fmemberAge2=%s, fmemberWorkInfo2=%s, fmemberTel2=%s, fmemberRelationship2=%s, fmemberAppellation3=%s, fmemberName3=%s, fmemberAge3=%s, fmemberWorkInfo3=%s, fmemberTel3=%s, fmemberRelationship3=%s, fmemberAppellation4=%s, fmemberName4=%s, fmemberAge4=%s, fmemberWorkInfo4=%s, fmemberTel4=%s, fmemberRelationship4=%s, fmemberAppellation5=%s, fmemberName5=%s, fmemberAge5=%s, fmemberWorkInfo5=%s, fmemberTel5=%s, fmemberRelationship5=%s, fmemberAppellation6=%s, fmemberName6=%s, fmemberAge6=%s, fmemberWorkInfo6=%s, fmemberTel6=%s, fmemberRelationship6=%s, fmemberAppellation7=%s, fmemberName7=%s, fmemberAge7=%s, fmemberWorkInfo7=%s, fmemberTel7=%s, fmemberRelationship7=%s, fmemberAppellation8=%s, fmemberName8=%s, fmemberAge8=%s, fmemberWorkInfo8=%s, fmemberTel8=%s, fmemberRelationship8=%s, familyTotalPersonNum=%s, familyYearInCome=%s, economicSources=%s, leisureStyle=%s, otherLeisureStyle=%s, farthestCity=%s, clothingBrand=%s, appearanceScore=%s, contactScore=%s, selfConfidenceScore=%s, hobby=%s, monthlyMoney=%s, remark=%s]",
						id, selectId, studentId, name, famillyReg, sex, nation,
						moveTel, collegeName, speName, speGrade, className,
						idCard, speType, oldName, comeType, height, weight,
						inCommunistParty, communistPartyIntroducer,
						inCommunistYouthLeague, communistYouthLeagueIntroducer,
						caucusJobStatus, awardOrPunishment,
						resumeStartEndTime1, resumeAddress1, resumeIntroducer1,
						resumeUnit1, resumeTel1, resumeStartEndTime2,
						resumeAddress2, resumeIntroducer2, resumeUnit2,
						resumeTel2, resumeStartEndTime3, resumeAddress3,
						resumeIntroducer3, resumeUnit3, resumeTel3,
						resumeStartEndTime4, resumeAddress4, resumeIntroducer4,
						resumeUnit4, resumeTel4, resumeStartEndTime5,
						resumeAddress5, resumeIntroducer5, resumeUnit5,
						resumeTel5, resumeStartEndTime6, resumeAddress6,
						resumeIntroducer6, resumeUnit6, resumeTel6, isMarry,
						loverName, loverPolitical, loverWorkInfo,
						fmemberAppellation1, fmemberName1, fmemberAge1,
						fmemberWorkInfo1, fmemberTel1, fmemberRelationship1,
						fmemberAppellation2, fmemberName2, fmemberAge2,
						fmemberWorkInfo2, fmemberTel2, fmemberRelationship2,
						fmemberAppellation3, fmemberName3, fmemberAge3,
						fmemberWorkInfo3, fmemberTel3, fmemberRelationship3,
						fmemberAppellation4, fmemberName4, fmemberAge4,
						fmemberWorkInfo4, fmemberTel4, fmemberRelationship4,
						fmemberAppellation5, fmemberName5, fmemberAge5,
						fmemberWorkInfo5, fmemberTel5, fmemberRelationship5,
						fmemberAppellation6, fmemberName6, fmemberAge6,
						fmemberWorkInfo6, fmemberTel6, fmemberRelationship6,
						fmemberAppellation7, fmemberName7, fmemberAge7,
						fmemberWorkInfo7, fmemberTel7, fmemberRelationship7,
						fmemberAppellation8, fmemberName8, fmemberAge8,
						fmemberWorkInfo8, fmemberTel8, fmemberRelationship8,
						familyTotalPersonNum, familyYearInCome,
						economicSources, leisureStyle, otherLeisureStyle,
						farthestCity, clothingBrand, appearanceScore,
						contactScore, selfConfidenceScore, hobby, monthlyMoney,
						remark);
	}
	
}