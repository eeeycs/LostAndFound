package com.ycs.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Studentcrawler entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "studentcrawler", catalog = "studentinfo")
public class Studentcrawler implements java.io.Serializable {

	// Fields

	private Integer id;
	private String selectId;
	private String examId;
	private String studyId;
	private String name;
	private String sex;
	private String img;
	private String xibie;
	private String zhuanye;
	private String xuezi;
	private String peiyangcengci;
	private String nianji;
	private String banji;
	private String xinzhuanye;
	private String xinbanji;
	private String xuejizhuangtai;
	private String ruxueriqi;
	private String shenfenzhenghaoma;
	private String chushengnianyueri;
	private String minzu;
	private String zhengzhimianmao;
	private String address;
	private String huochezhandian;
	private String fumuxingming;
	private String gerendianhua;
	private String jiatingdianhua;
	private String techang;
	private String shifoubenrenzhaopian;
	private String suodingxinxi;
	private String pwd;

	// Constructors

	/** default constructor */
	public Studentcrawler() {
	}

	/** full constructor */
	public Studentcrawler(String selectId, String examId, String studyId,
			String name, String sex, String img, String xibie, String zhuanye,
			String xuezi, String peiyangcengci, String nianji, String banji,
			String xinzhuanye, String xinbanji, String xuejizhuangtai,
			String ruxueriqi, String shenfenzhenghaoma,
			String chushengnianyueri, String minzu, String zhengzhimianmao,
			String address, String huochezhandian, String fumuxingming,
			String gerendianhua, String jiatingdianhua, String techang,
			String shifoubenrenzhaopian, String suodingxinxi, String pwd) {
		this.selectId = selectId;
		this.examId = examId;
		this.studyId = studyId;
		this.name = name;
		this.sex = sex;
		this.img = img;
		this.xibie = xibie;
		this.zhuanye = zhuanye;
		this.xuezi = xuezi;
		this.peiyangcengci = peiyangcengci;
		this.nianji = nianji;
		this.banji = banji;
		this.xinzhuanye = xinzhuanye;
		this.xinbanji = xinbanji;
		this.xuejizhuangtai = xuejizhuangtai;
		this.ruxueriqi = ruxueriqi;
		this.shenfenzhenghaoma = shenfenzhenghaoma;
		this.chushengnianyueri = chushengnianyueri;
		this.minzu = minzu;
		this.zhengzhimianmao = zhengzhimianmao;
		this.address = address;
		this.huochezhandian = huochezhandian;
		this.fumuxingming = fumuxingming;
		this.gerendianhua = gerendianhua;
		this.jiatingdianhua = jiatingdianhua;
		this.techang = techang;
		this.shifoubenrenzhaopian = shifoubenrenzhaopian;
		this.suodingxinxi = suodingxinxi;
		this.pwd = pwd;
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

	@Column(name = "selectId", length = 128)
	public String getSelectId() {
		return this.selectId;
	}

	public void setSelectId(String selectId) {
		this.selectId = selectId;
	}

	@Column(name = "examId", length = 128)
	public String getExamId() {
		return this.examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	@Column(name = "studyId", length = 128)
	public String getStudyId() {
		return this.studyId;
	}

	public void setStudyId(String studyId) {
		this.studyId = studyId;
	}

	@Column(name = "name", length = 128)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "sex", length = 128)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "img", length = 128)
	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Column(name = "xibie", length = 128)
	public String getXibie() {
		return this.xibie;
	}

	public void setXibie(String xibie) {
		this.xibie = xibie;
	}

	@Column(name = "zhuanye", length = 128)
	public String getZhuanye() {
		return this.zhuanye;
	}

	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

	@Column(name = "xuezi", length = 128)
	public String getXuezi() {
		return this.xuezi;
	}

	public void setXuezi(String xuezi) {
		this.xuezi = xuezi;
	}

	@Column(name = "peiyangcengci", length = 128)
	public String getPeiyangcengci() {
		return this.peiyangcengci;
	}

	public void setPeiyangcengci(String peiyangcengci) {
		this.peiyangcengci = peiyangcengci;
	}

	@Column(name = "nianji", length = 128)
	public String getNianji() {
		return this.nianji;
	}

	public void setNianji(String nianji) {
		this.nianji = nianji;
	}

	@Column(name = "banji", length = 128)
	public String getBanji() {
		return this.banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	@Column(name = "xinzhuanye", length = 128)
	public String getXinzhuanye() {
		return this.xinzhuanye;
	}

	public void setXinzhuanye(String xinzhuanye) {
		this.xinzhuanye = xinzhuanye;
	}

	@Column(name = "xinbanji", length = 128)
	public String getXinbanji() {
		return this.xinbanji;
	}

	public void setXinbanji(String xinbanji) {
		this.xinbanji = xinbanji;
	}

	@Column(name = "xuejizhuangtai", length = 128)
	public String getXuejizhuangtai() {
		return this.xuejizhuangtai;
	}

	public void setXuejizhuangtai(String xuejizhuangtai) {
		this.xuejizhuangtai = xuejizhuangtai;
	}

	@Column(name = "ruxueriqi", length = 128)
	public String getRuxueriqi() {
		return this.ruxueriqi;
	}

	public void setRuxueriqi(String ruxueriqi) {
		this.ruxueriqi = ruxueriqi;
	}

	@Column(name = "shenfenzhenghaoma", length = 128)
	public String getShenfenzhenghaoma() {
		return this.shenfenzhenghaoma;
	}

	public void setShenfenzhenghaoma(String shenfenzhenghaoma) {
		this.shenfenzhenghaoma = shenfenzhenghaoma;
	}

	@Column(name = "chushengnianyueri", length = 128)
	public String getChushengnianyueri() {
		return this.chushengnianyueri;
	}

	public void setChushengnianyueri(String chushengnianyueri) {
		this.chushengnianyueri = chushengnianyueri;
	}

	@Column(name = "minzu", length = 128)
	public String getMinzu() {
		return this.minzu;
	}

	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}

	@Column(name = "zhengzhimianmao", length = 128)
	public String getZhengzhimianmao() {
		return this.zhengzhimianmao;
	}

	public void setZhengzhimianmao(String zhengzhimianmao) {
		this.zhengzhimianmao = zhengzhimianmao;
	}

	@Column(name = "address", length = 128)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "huochezhandian", length = 128)
	public String getHuochezhandian() {
		return this.huochezhandian;
	}

	public void setHuochezhandian(String huochezhandian) {
		this.huochezhandian = huochezhandian;
	}

	@Column(name = "fumuxingming", length = 128)
	public String getFumuxingming() {
		return this.fumuxingming;
	}

	public void setFumuxingming(String fumuxingming) {
		this.fumuxingming = fumuxingming;
	}

	@Column(name = "gerendianhua", length = 128)
	public String getGerendianhua() {
		return this.gerendianhua;
	}

	public void setGerendianhua(String gerendianhua) {
		this.gerendianhua = gerendianhua;
	}

	@Column(name = "jiatingdianhua", length = 128)
	public String getJiatingdianhua() {
		return this.jiatingdianhua;
	}

	public void setJiatingdianhua(String jiatingdianhua) {
		this.jiatingdianhua = jiatingdianhua;
	}

	@Column(name = "techang", length = 128)
	public String getTechang() {
		return this.techang;
	}

	public void setTechang(String techang) {
		this.techang = techang;
	}

	@Column(name = "shifoubenrenzhaopian", length = 128)
	public String getShifoubenrenzhaopian() {
		return this.shifoubenrenzhaopian;
	}

	public void setShifoubenrenzhaopian(String shifoubenrenzhaopian) {
		this.shifoubenrenzhaopian = shifoubenrenzhaopian;
	}

	@Column(name = "suodingxinxi", length = 128)
	public String getSuodingxinxi() {
		return this.suodingxinxi;
	}

	public void setSuodingxinxi(String suodingxinxi) {
		this.suodingxinxi = suodingxinxi;
	}

	@Column(name = "pwd", length = 128)
	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return String
				.format("Studentcrawler [id=%s, selectId=%s, examId=%s, studyId=%s, name=%s, sex=%s, img=%s, xibie=%s, zhuanye=%s, xuezi=%s, peiyangcengci=%s, nianji=%s, banji=%s, xinzhuanye=%s, xinbanji=%s, xuejizhuangtai=%s, ruxueriqi=%s, shenfenzhenghaoma=%s, chushengnianyueri=%s, minzu=%s, zhengzhimianmao=%s, address=%s, huochezhandian=%s, fumuxingming=%s, gerendianhua=%s, jiatingdianhua=%s, techang=%s, shifoubenrenzhaopian=%s, suodingxinxi=%s, pwd=%s]",
						id, selectId, examId, studyId, name, sex, img, xibie,
						zhuanye, xuezi, peiyangcengci, nianji, banji,
						xinzhuanye, xinbanji, xuejizhuangtai, ruxueriqi,
						shenfenzhenghaoma, chushengnianyueri, minzu,
						zhengzhimianmao, address, huochezhandian, fumuxingming,
						gerendianhua, jiatingdianhua, techang,
						shifoubenrenzhaopian, suodingxinxi, pwd);
	}
	
	

}