package com.ycs.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Teacherinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "teacherinfo", catalog = "studentinfo")
public class Teacherinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String selectId;
	private String name;
	private String sex;
	private String teacherId;
	private String pwd;
	private String img;
	private String xiaoqu;
	private String bumen;
	private String bianzhiType;
	private String idcard;
	private String jiguan;
	private String minzu;
	private String xueli;
	private String xuewei;
	private String zhicheng;
	private String zhichengType;
	private String zhichengRatio;
	private String chushengnianyue;
	private String dangzhengzhiwu;
	private String renkedanwei;
	private String suoshuxishi;
	private String biyexuexiao;
	private String biyezhuanye;
	private String biyeDate;
	private String laixiaoDate;
	private String bangongPhone;
	private String yidongPhone;
	private String yidongPhonePublic;
	private String bangongAddress;
	private String qqNumber;
	private String qqNumberPublic;
	private String zhuanzhiTeacher;
	private String shifouzaixiao;
	private String shangke;
	private String daoshi;
	private String shiyan;
	private String jiankao;
	private String email;
	private String mainkecheng;
	private String yanjiufangxiang;
	private String mainAchievementAward;
	private String teacherjiyu;
	private String status;

	// Constructors

	/** default constructor */
	public Teacherinfo() {
	}

	/** full constructor */
	public Teacherinfo(String selectId, String name, String sex,
			String teacherId, String pwd, String img, String xiaoqu,
			String bumen, String bianzhiType, String idcard, String jiguan,
			String minzu, String xueli, String xuewei, String zhicheng,
			String zhichengType, String zhichengRatio, String chushengnianyue,
			String dangzhengzhiwu, String renkedanwei, String suoshuxishi,
			String biyexuexiao, String biyezhuanye, String biyeDate,
			String laixiaoDate, String bangongPhone, String yidongPhone,
			String yidongPhonePublic, String bangongAddress, String qqNumber,
			String qqNumberPublic, String zhuanzhiTeacher,
			String shifouzaixiao, String shangke, String daoshi, String shiyan,
			String jiankao, String email, String mainkecheng,
			String yanjiufangxiang, String mainAchievementAward,
			String teacherjiyu, String status) {
		this.selectId = selectId;
		this.name = name;
		this.sex = sex;
		this.teacherId = teacherId;
		this.pwd = pwd;
		this.img = img;
		this.xiaoqu = xiaoqu;
		this.bumen = bumen;
		this.bianzhiType = bianzhiType;
		this.idcard = idcard;
		this.jiguan = jiguan;
		this.minzu = minzu;
		this.xueli = xueli;
		this.xuewei = xuewei;
		this.zhicheng = zhicheng;
		this.zhichengType = zhichengType;
		this.zhichengRatio = zhichengRatio;
		this.chushengnianyue = chushengnianyue;
		this.dangzhengzhiwu = dangzhengzhiwu;
		this.renkedanwei = renkedanwei;
		this.suoshuxishi = suoshuxishi;
		this.biyexuexiao = biyexuexiao;
		this.biyezhuanye = biyezhuanye;
		this.biyeDate = biyeDate;
		this.laixiaoDate = laixiaoDate;
		this.bangongPhone = bangongPhone;
		this.yidongPhone = yidongPhone;
		this.yidongPhonePublic = yidongPhonePublic;
		this.bangongAddress = bangongAddress;
		this.qqNumber = qqNumber;
		this.qqNumberPublic = qqNumberPublic;
		this.zhuanzhiTeacher = zhuanzhiTeacher;
		this.shifouzaixiao = shifouzaixiao;
		this.shangke = shangke;
		this.daoshi = daoshi;
		this.shiyan = shiyan;
		this.jiankao = jiankao;
		this.email = email;
		this.mainkecheng = mainkecheng;
		this.yanjiufangxiang = yanjiufangxiang;
		this.mainAchievementAward = mainAchievementAward;
		this.teacherjiyu = teacherjiyu;
		this.status = status;
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

	@Column(name = "selectId", length = 64)
	public String getSelectId() {
		return this.selectId;
	}

	public void setSelectId(String selectId) {
		this.selectId = selectId;
	}

	@Column(name = "name", length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sex", length = 64)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "teacherId", length = 64)
	public String getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	@Column(name = "pwd", length = 64)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Column(name = "img")
	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Column(name = "xiaoqu", length = 64)
	public String getXiaoqu() {
		return this.xiaoqu;
	}

	public void setXiaoqu(String xiaoqu) {
		this.xiaoqu = xiaoqu;
	}

	@Column(name = "bumen", length = 64)
	public String getBumen() {
		return this.bumen;
	}

	public void setBumen(String bumen) {
		this.bumen = bumen;
	}

	@Column(name = "bianzhiType", length = 64)
	public String getBianzhiType() {
		return this.bianzhiType;
	}

	public void setBianzhiType(String bianzhiType) {
		this.bianzhiType = bianzhiType;
	}

	@Column(name = "idcard", length = 64)
	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	@Column(name = "jiguan", length = 64)
	public String getJiguan() {
		return this.jiguan;
	}

	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}

	@Column(name = "minzu", length = 64)
	public String getMinzu() {
		return this.minzu;
	}

	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}

	@Column(name = "xueli", length = 64)
	public String getXueli() {
		return this.xueli;
	}

	public void setXueli(String xueli) {
		this.xueli = xueli;
	}

	@Column(name = "xuewei", length = 64)
	public String getXuewei() {
		return this.xuewei;
	}

	public void setXuewei(String xuewei) {
		this.xuewei = xuewei;
	}

	@Column(name = "zhicheng", length = 64)
	public String getZhicheng() {
		return this.zhicheng;
	}

	public void setZhicheng(String zhicheng) {
		this.zhicheng = zhicheng;
	}

	@Column(name = "zhichengType", length = 64)
	public String getZhichengType() {
		return this.zhichengType;
	}

	public void setZhichengType(String zhichengType) {
		this.zhichengType = zhichengType;
	}

	@Column(name = "zhichengRatio", length = 64)
	public String getZhichengRatio() {
		return this.zhichengRatio;
	}

	public void setZhichengRatio(String zhichengRatio) {
		this.zhichengRatio = zhichengRatio;
	}

	@Column(name = "chushengnianyue", length = 64)
	public String getChushengnianyue() {
		return this.chushengnianyue;
	}

	public void setChushengnianyue(String chushengnianyue) {
		this.chushengnianyue = chushengnianyue;
	}

	@Column(name = "dangzhengzhiwu", length = 64)
	public String getDangzhengzhiwu() {
		return this.dangzhengzhiwu;
	}

	public void setDangzhengzhiwu(String dangzhengzhiwu) {
		this.dangzhengzhiwu = dangzhengzhiwu;
	}

	@Column(name = "renkedanwei", length = 64)
	public String getRenkedanwei() {
		return this.renkedanwei;
	}

	public void setRenkedanwei(String renkedanwei) {
		this.renkedanwei = renkedanwei;
	}

	@Column(name = "suoshuxishi", length = 64)
	public String getSuoshuxishi() {
		return this.suoshuxishi;
	}

	public void setSuoshuxishi(String suoshuxishi) {
		this.suoshuxishi = suoshuxishi;
	}

	@Column(name = "biyexuexiao", length = 64)
	public String getBiyexuexiao() {
		return this.biyexuexiao;
	}

	public void setBiyexuexiao(String biyexuexiao) {
		this.biyexuexiao = biyexuexiao;
	}

	@Column(name = "biyezhuanye", length = 64)
	public String getBiyezhuanye() {
		return this.biyezhuanye;
	}

	public void setBiyezhuanye(String biyezhuanye) {
		this.biyezhuanye = biyezhuanye;
	}

	@Column(name = "biyeDate", length = 64)
	public String getBiyeDate() {
		return this.biyeDate;
	}

	public void setBiyeDate(String biyeDate) {
		this.biyeDate = biyeDate;
	}

	@Column(name = "laixiaoDate", length = 64)
	public String getLaixiaoDate() {
		return this.laixiaoDate;
	}

	public void setLaixiaoDate(String laixiaoDate) {
		this.laixiaoDate = laixiaoDate;
	}

	@Column(name = "bangongPhone", length = 64)
	public String getBangongPhone() {
		return this.bangongPhone;
	}

	public void setBangongPhone(String bangongPhone) {
		this.bangongPhone = bangongPhone;
	}

	@Column(name = "yidongPhone", length = 64)
	public String getYidongPhone() {
		return this.yidongPhone;
	}

	public void setYidongPhone(String yidongPhone) {
		this.yidongPhone = yidongPhone;
	}

	@Column(name = "yidongPhonePublic", length = 64)
	public String getYidongPhonePublic() {
		return this.yidongPhonePublic;
	}

	public void setYidongPhonePublic(String yidongPhonePublic) {
		this.yidongPhonePublic = yidongPhonePublic;
	}

	@Column(name = "bangongAddress", length = 64)
	public String getBangongAddress() {
		return this.bangongAddress;
	}

	public void setBangongAddress(String bangongAddress) {
		this.bangongAddress = bangongAddress;
	}

	@Column(name = "qqNumber", length = 64)
	public String getQqNumber() {
		return this.qqNumber;
	}

	public void setQqNumber(String qqNumber) {
		this.qqNumber = qqNumber;
	}

	@Column(name = "qqNumberPublic", length = 64)
	public String getQqNumberPublic() {
		return this.qqNumberPublic;
	}

	public void setQqNumberPublic(String qqNumberPublic) {
		this.qqNumberPublic = qqNumberPublic;
	}

	@Column(name = "zhuanzhiTeacher", length = 64)
	public String getZhuanzhiTeacher() {
		return this.zhuanzhiTeacher;
	}

	public void setZhuanzhiTeacher(String zhuanzhiTeacher) {
		this.zhuanzhiTeacher = zhuanzhiTeacher;
	}

	@Column(name = "shifouzaixiao", length = 64)
	public String getShifouzaixiao() {
		return this.shifouzaixiao;
	}

	public void setShifouzaixiao(String shifouzaixiao) {
		this.shifouzaixiao = shifouzaixiao;
	}

	@Column(name = "shangke", length = 64)
	public String getShangke() {
		return this.shangke;
	}

	public void setShangke(String shangke) {
		this.shangke = shangke;
	}

	@Column(name = "daoshi", length = 64)
	public String getDaoshi() {
		return this.daoshi;
	}

	public void setDaoshi(String daoshi) {
		this.daoshi = daoshi;
	}

	@Column(name = "shiyan", length = 64)
	public String getShiyan() {
		return this.shiyan;
	}

	public void setShiyan(String shiyan) {
		this.shiyan = shiyan;
	}

	@Column(name = "jiankao", length = 64)
	public String getJiankao() {
		return this.jiankao;
	}

	public void setJiankao(String jiankao) {
		this.jiankao = jiankao;
	}

	@Column(name = "email", length = 64)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mainkecheng", length = 65535)
	public String getMainkecheng() {
		return this.mainkecheng;
	}

	public void setMainkecheng(String mainkecheng) {
		this.mainkecheng = mainkecheng;
	}

	@Column(name = "yanjiufangxiang", length = 65535)
	public String getYanjiufangxiang() {
		return this.yanjiufangxiang;
	}

	public void setYanjiufangxiang(String yanjiufangxiang) {
		this.yanjiufangxiang = yanjiufangxiang;
	}

	@Column(name = "mainAchievementAward", length = 65535)
	public String getMainAchievementAward() {
		return this.mainAchievementAward;
	}

	public void setMainAchievementAward(String mainAchievementAward) {
		this.mainAchievementAward = mainAchievementAward;
	}

	@Column(name = "teacherjiyu", length = 1024)
	public String getTeacherjiyu() {
		return this.teacherjiyu;
	}

	public void setTeacherjiyu(String teacherjiyu) {
		this.teacherjiyu = teacherjiyu;
	}

	@Column(name = "status", length = 64)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}