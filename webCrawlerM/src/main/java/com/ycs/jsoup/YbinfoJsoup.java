package com.ycs.jsoup;

import java.util.List;

import javax.annotation.Resource;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;

import com.ycs.model.domain.Ybinfo;
import com.ycs.model.domain.Ybregister;
import com.ycs.model.service.BasiceTestService;
import com.ycs.model.service.YbinfoService;
import com.ycs.model.service.YbregisterService;
@Component
public class YbinfoJsoup extends BasiceTestService{
	@Resource
	YbregisterService ybregisterService;
	@Resource
	YbinfoService ybinfoService;
	
	@Rollback(false)
	@Test
	public void getRegisterInfo() throws InterruptedException{
		for(int i=6;i<=9;i++){
			List<Ybinfo>ybinfos=ybinfoService.getRegisterInfo(i);
			for(Ybinfo ybinfo:ybinfos){
				System.out.println(ybinfo.getSelectId());
//				saveData(ybinfo.getSelectId(), ybinfo.getRegisterInfo());					
			}
		}
	}
	
	
	public void saveData(Integer selectId,String content) {
		Document doc=Jsoup.parse(content);
		
		String studentId=doc.getElementById("StudentRegisterInfo_StudentId").text();
		String name=doc.getElementById("StudentRegisterInfo_Name").text();
		String famillyReg=doc.getElementById("StudentRegisterInfo_FamillyReg").text();
		String sex=doc.getElementById("StudentRegisterInfo_Sex").text();
		String nation=doc.getElementById("StudentRegisterInfo_Nation").text();
		String moveTel=doc.getElementById("StudentRegisterInfo_MoveTel").text();
		String collegeName=doc.getElementById("StudentRegisterInfo_CollegeName").text();
		String speName=doc.getElementById("StudentRegisterInfo_SpeName").text();
		String speGrade=doc.getElementById("StudentRegisterInfo_SpeGrade").text();
		String className=doc.getElementById("StudentRegisterInfo_ClassName").text();
		String idCard=doc.getElementById("StudentRegisterInfo_IdCard").text();
		String speType=doc.getElementById("StudentRegisterInfo_SpeType").text();
		String oldName=doc.getElementById("StudentRegisterInfo_OldName").val();
		String comeType="";
		Elements comeTypes=doc.getElementById("StudentRegisterInfo_ComeType").children();
		for(Element element:comeTypes){
			if(element.attr("selected").equals("selected")){
				comeType=element.attr("value");
			}
		}
		String height=doc.getElementById("StudentRegisterInfo_Height").val();
		String weight=doc.getElementById("StudentRegisterInfo_Weight").val();
		String inCommunistParty=doc.getElementById("StudentRegisterInfo_InCommunistParty").val();
		String communistPartyIntroducer=doc.getElementById("StudentRegisterInfo_CommunistPartyIntroducer").val();
		String inCommunistYouthLeague=doc.getElementById("StudentRegisterInfo_InCommunistYouthLeague").val();
		String communistYouthLeagueIntroducer=doc.getElementById("StudentRegisterInfo_CommunistYouthLeagueIntroducer").val();
		String caucusJobStatus=doc.getElementById("StudentRegisterInfo_CaucusJobStatus").text();
		String awardOrPunishment=doc.getElementById("StudentRegisterInfo_AwardOrPunishment").text();
		String resumeStartEndTime1=doc.getElementById("StudentRegisterInfo_ResumeStartEndTime1").val();
		String resumeAddress1=doc.getElementById("StudentRegisterInfo_ResumeAddress1").val();
		String resumeIntroducer1=doc.getElementById("StudentRegisterInfo_ResumeIntroducer1").val();
		String resumeUnit1=doc.getElementById("StudentRegisterInfo_ResumeUnit1").val();
		String resumeTel1=doc.getElementById("StudentRegisterInfo_ResumeTel1").val();
		String resumeStartEndTime2=doc.getElementById("StudentRegisterInfo_ResumeStartEndTime2").val();
		String resumeAddress2=doc.getElementById("StudentRegisterInfo_ResumeAddress2").val();
		String resumeIntroducer2=doc.getElementById("StudentRegisterInfo_ResumeIntroducer2").val();
		String resumeUnit2=doc.getElementById("StudentRegisterInfo_ResumeUnit2").val();
		String resumeTel2=doc.getElementById("StudentRegisterInfo_ResumeTel2").val();
		String resumeStartEndTime3=doc.getElementById("StudentRegisterInfo_ResumeStartEndTime3").val();
		String resumeAddress3=doc.getElementById("StudentRegisterInfo_ResumeAddress3").val();
		String resumeIntroducer3=doc.getElementById("StudentRegisterInfo_ResumeIntroducer3").val();
		String resumeUnit3=doc.getElementById("StudentRegisterInfo_ResumeUnit3").val();
		String resumeTel3=doc.getElementById("StudentRegisterInfo_ResumeTel3").val();
		String resumeStartEndTime4=doc.getElementById("StudentRegisterInfo_ResumeStartEndTime4").val();
		String resumeAddress4=doc.getElementById("StudentRegisterInfo_ResumeAddress4").val();
		String resumeIntroducer4=doc.getElementById("StudentRegisterInfo_ResumeIntroducer4").val();
		String resumeUnit4=doc.getElementById("StudentRegisterInfo_ResumeUnit4").val();
		String resumeTel4=doc.getElementById("StudentRegisterInfo_ResumeTel4").val();
		String resumeStartEndTime5=doc.getElementById("StudentRegisterInfo_ResumeStartEndTime5").val();
		String resumeAddress5=doc.getElementById("StudentRegisterInfo_ResumeAddress5").val();
		String resumeIntroducer5=doc.getElementById("StudentRegisterInfo_ResumeIntroducer5").val();
		String resumeUnit5=doc.getElementById("StudentRegisterInfo_ResumeUnit5").val();
		String resumeTel5=doc.getElementById("StudentRegisterInfo_ResumeTel5").val();
		String resumeStartEndTime6=doc.getElementById("StudentRegisterInfo_ResumeStartEndTime6").val();
		String resumeAddress6=doc.getElementById("StudentRegisterInfo_ResumeAddress6").val();
		String resumeIntroducer6=doc.getElementById("StudentRegisterInfo_ResumeIntroducer6").val();
		String resumeUnit6=doc.getElementById("StudentRegisterInfo_ResumeUnit6").val();
		String resumeTel6=doc.getElementById("StudentRegisterInfo_ResumeTel6").val();
		String isMarry="";
		Elements isMarrys=doc.getElementById("StudentRegisterInfo_IsMarry_0").parent().parent().select("input[checked]");
		isMarry=isMarrys.attr("value");
		String loverName=doc.getElementById("StudentRegisterInfo_LoverName").val();
		String loverPolitical="";
		Elements loverPoliticals=doc.getElementById("StudentRegisterInfo_LoverPolitical").children();
		for(Element element:loverPoliticals){
			if(element.attr("selected").equals("selected")){
				loverPolitical=element.attr("value");
			}
		}
		String loverWorkInfo=doc.getElementById("StudentRegisterInfo_LoverWorkInfo").val();
		String fMemberAppellation1=doc.getElementById("StudentRegisterInfo_FMemberAppellation1").val();
		String fMemberName1=doc.getElementById("StudentRegisterInfo_FMemberName1").val();
		String fMemberAge1=doc.getElementById("StudentRegisterInfo_FMemberAge1").val();
		String fMemberWorkInfo1=doc.getElementById("StudentRegisterInfo_FMemberWorkInfo1").val();
		String fMemberTel1=doc.getElementById("StudentRegisterInfo_FMemberTel1").val();
		String fMemberRelationship1=doc.getElementById("StudentRegisterInfo_FMemberRelationship1").val();
		String fMemberAppellation2=doc.getElementById("StudentRegisterInfo_FMemberAppellation2").val();
		String fMemberName2=doc.getElementById("StudentRegisterInfo_FMemberName2").val();
		String fMemberAge2=doc.getElementById("StudentRegisterInfo_FMemberAge2").val();
		String fMemberWorkInfo2=doc.getElementById("StudentRegisterInfo_FMemberWorkInfo2").val();
		String fMemberTel2=doc.getElementById("StudentRegisterInfo_FMemberTel2").val();
		String fMemberRelationship2=doc.getElementById("StudentRegisterInfo_FMemberRelationship2").val();
		String fMemberAppellation3=doc.getElementById("StudentRegisterInfo_FMemberAppellation3").val();
		String fMemberName3=doc.getElementById("StudentRegisterInfo_FMemberName3").val();
		String fMemberAge3=doc.getElementById("StudentRegisterInfo_FMemberAge3").val();
		String fMemberWorkInfo3=doc.getElementById("StudentRegisterInfo_FMemberWorkInfo3").val();
		String fMemberTel3=doc.getElementById("StudentRegisterInfo_FMemberTel3").val();
		String fMemberRelationship3=doc.getElementById("StudentRegisterInfo_FMemberRelationship3").val();
		String fMemberAppellation4=doc.getElementById("StudentRegisterInfo_FMemberAppellation4").val();
		String fMemberName4=doc.getElementById("StudentRegisterInfo_FMemberName4").val();
		String fMemberAge4=doc.getElementById("StudentRegisterInfo_FMemberAge4").val();
		String fMemberWorkInfo4=doc.getElementById("StudentRegisterInfo_FMemberWorkInfo4").val();
		String fMemberTel4=doc.getElementById("StudentRegisterInfo_FMemberTel4").val();
		String fMemberRelationship4=doc.getElementById("StudentRegisterInfo_FMemberRelationship4").val();
		String fMemberAppellation5=doc.getElementById("StudentRegisterInfo_FMemberAppellation5").val();
		String fMemberName5=doc.getElementById("StudentRegisterInfo_FMemberName5").val();
		String fMemberAge5=doc.getElementById("StudentRegisterInfo_FMemberAge5").val();
		String fMemberWorkInfo5=doc.getElementById("StudentRegisterInfo_FMemberWorkInfo5").val();
		String fMemberTel5=doc.getElementById("StudentRegisterInfo_FMemberTel5").val();
		String fMemberRelationship5=doc.getElementById("StudentRegisterInfo_FMemberRelationship5").val();
		String fMemberAppellation6=doc.getElementById("StudentRegisterInfo_FMemberAppellation6").val();
		String fMemberName6=doc.getElementById("StudentRegisterInfo_FMemberName6").val();
		String fMemberAge6=doc.getElementById("StudentRegisterInfo_FMemberAge6").val();
		String fMemberWorkInfo6=doc.getElementById("StudentRegisterInfo_FMemberWorkInfo6").val();
		String fMemberTel6=doc.getElementById("StudentRegisterInfo_FMemberTel6").val();
		String fMemberRelationship6=doc.getElementById("StudentRegisterInfo_FMemberRelationship6").val();
		String fMemberAppellation7=doc.getElementById("StudentRegisterInfo_FMemberAppellation7").val();
		String fMemberName7=doc.getElementById("StudentRegisterInfo_FMemberName7").val();
		String fMemberAge7=doc.getElementById("StudentRegisterInfo_FMemberAge7").val();
		String fMemberWorkInfo7=doc.getElementById("StudentRegisterInfo_FMemberWorkInfo7").val();
		String fMemberTel7=doc.getElementById("StudentRegisterInfo_FMemberTel7").val();
		String fMemberRelationship7=doc.getElementById("StudentRegisterInfo_FMemberRelationship7").val();
		String fMemberAppellation8=doc.getElementById("StudentRegisterInfo_FMemberAppellation8").val();
		String fMemberName8=doc.getElementById("StudentRegisterInfo_FMemberName8").val();
		String fMemberAge8=doc.getElementById("StudentRegisterInfo_FMemberAge8").val();
		String fMemberWorkInfo8=doc.getElementById("StudentRegisterInfo_FMemberWorkInfo8").val();
		String fMemberTel8=doc.getElementById("StudentRegisterInfo_FMemberTel8").val();
		String fMemberRelationship8=doc.getElementById("StudentRegisterInfo_FMemberRelationship8").val();
		String familyTotalPersonNum=doc.getElementById("StudentRegisterInfo_FamilyTotalPersonNum").val();
		String familyYearInCome=doc.getElementById("StudentRegisterInfo_FamilyYearInCome").val();
		String economicSources=doc.getElementById("StudentRegisterInfo_EconomicSources").val();
		String leisureStyle="";
		Elements leisureStyles=doc.getElementById("StudentRegisterInfo_LeisureStyle").getElementsByTag("input");
		for(Element element:leisureStyles){
			if(element.attr("checked").equals("checked")){
				leisureStyle=leisureStyle+element.attr("id")+",";
			}
		}
		if(!leisureStyle.equals("")){
			leisureStyle=leisureStyle.substring(0, leisureStyle.length()-1);
		}
		
		String otherLeisureStyle=doc.getElementById("StudentRegisterInfo_OtherLeisureStyle").val();
		String farthestCity=doc.getElementById("StudentRegisterInfo_FarthestCity").val();
		String clothingBrand=doc.getElementById("StudentRegisterInfo_ClothingBrand").val();
		String appearanceScore=doc.getElementById("StudentRegisterInfo_AppearanceScore").val();
		String contactScore=doc.getElementById("StudentRegisterInfo_ContactScore").val();
		String selfConfidenceScore=doc.getElementById("StudentRegisterInfo_SelfConfidenceScore").val();
		String hobby=doc.getElementById("StudentRegisterInfo_Hobby").val();
		String monthlyMoney=doc.getElementById("StudentRegisterInfo_MonthlyMoney").val();
		String remark=doc.getElementById("StudentRegisterInfo_Remark").text();

		
		Ybregister ybregister=new Ybregister();
		ybregister.setSelectId(selectId);
		ybregister.setStudentId(studentId);
		ybregister.setName(name);
		ybregister.setFamillyReg(famillyReg);
		ybregister.setSex(sex);
		ybregister.setNation(nation);
		ybregister.setMoveTel(moveTel);
		ybregister.setCollegeName(collegeName);
		ybregister.setSpeName(speName);
		ybregister.setSpeGrade(speGrade);
		ybregister.setClassName(className);
		ybregister.setIdCard(idCard);
		ybregister.setSpeType(speType);
		ybregister.setOldName(oldName);
		ybregister.setComeType(comeType);
		ybregister.setHeight(height);
		ybregister.setWeight(weight);
		ybregister.setInCommunistParty(inCommunistParty);
		ybregister.setCommunistPartyIntroducer(communistPartyIntroducer);
		ybregister.setInCommunistYouthLeague(inCommunistYouthLeague);
		ybregister.setCommunistYouthLeagueIntroducer(communistYouthLeagueIntroducer);
		ybregister.setCaucusJobStatus(caucusJobStatus);
		ybregister.setAwardOrPunishment(awardOrPunishment);
		ybregister.setResumeStartEndTime1(resumeStartEndTime1);
		ybregister.setResumeAddress1(resumeAddress1);
		ybregister.setResumeIntroducer1(resumeIntroducer1);
		ybregister.setResumeUnit1(resumeUnit1);
		ybregister.setResumeTel1(resumeTel1);
		ybregister.setResumeStartEndTime2(resumeStartEndTime2);
		ybregister.setResumeAddress2(resumeAddress2);
		ybregister.setResumeIntroducer2(resumeIntroducer2);
		ybregister.setResumeUnit2(resumeUnit2);
		ybregister.setResumeTel2(resumeTel2);
		ybregister.setResumeStartEndTime3(resumeStartEndTime3);
		ybregister.setResumeAddress3(resumeAddress3);
		ybregister.setResumeIntroducer3(resumeIntroducer3);
		ybregister.setResumeUnit3(resumeUnit3);
		ybregister.setResumeTel3(resumeTel3);
		ybregister.setResumeStartEndTime4(resumeStartEndTime4);
		ybregister.setResumeAddress4(resumeAddress4);
		ybregister.setResumeIntroducer4(resumeIntroducer4);
		ybregister.setResumeUnit4(resumeUnit4);
		ybregister.setResumeTel4(resumeTel4);
		ybregister.setResumeStartEndTime5(resumeStartEndTime5);
		ybregister.setResumeAddress5(resumeAddress5);
		ybregister.setResumeIntroducer5(resumeIntroducer5);
		ybregister.setResumeUnit5(resumeUnit5);
		ybregister.setResumeTel5(resumeTel5);
		ybregister.setResumeStartEndTime6(resumeStartEndTime6);
		ybregister.setResumeAddress6(resumeAddress6);
		ybregister.setResumeIntroducer6(resumeIntroducer6);
		ybregister.setResumeUnit6(resumeUnit6);
		ybregister.setResumeTel6(resumeTel6);
		ybregister.setIsMarry(isMarry);
		ybregister.setLoverName(loverName);
		ybregister.setLoverPolitical(loverPolitical);
		ybregister.setLoverWorkInfo(loverWorkInfo);
		ybregister.setFmemberAppellation1(fMemberAppellation1);
		ybregister.setFmemberName1(fMemberName1);
		ybregister.setFmemberAge1(fMemberAge1);
		ybregister.setFmemberWorkInfo1(fMemberWorkInfo1);
		ybregister.setFmemberTel1(fMemberTel1);
		ybregister.setFmemberRelationship1(fMemberRelationship1);
		ybregister.setFmemberAppellation2(fMemberAppellation2);
		ybregister.setFmemberName2(fMemberName2);
		ybregister.setFmemberAge2(fMemberAge2);
		ybregister.setFmemberWorkInfo2(fMemberWorkInfo2);
		ybregister.setFmemberTel2(fMemberTel2);
		ybregister.setFmemberRelationship2(fMemberRelationship2);
		ybregister.setFmemberAppellation3(fMemberAppellation3);
		ybregister.setFmemberName3(fMemberName3);
		ybregister.setFmemberAge3(fMemberAge3);
		ybregister.setFmemberWorkInfo3(fMemberWorkInfo3);
		ybregister.setFmemberTel3(fMemberTel3);
		ybregister.setFmemberRelationship3(fMemberRelationship3);
		ybregister.setFmemberAppellation4(fMemberAppellation4);
		ybregister.setFmemberName4(fMemberName4);
		ybregister.setFmemberAge4(fMemberAge4);
		ybregister.setFmemberWorkInfo4(fMemberWorkInfo4);
		ybregister.setFmemberTel4(fMemberTel4);
		ybregister.setFmemberRelationship4(fMemberRelationship4);
		ybregister.setFmemberAppellation5(fMemberAppellation5);
		ybregister.setFmemberName5(fMemberName5);
		ybregister.setFmemberAge5(fMemberAge5);
		ybregister.setFmemberWorkInfo5(fMemberWorkInfo5);
		ybregister.setFmemberTel5(fMemberTel5);
		ybregister.setFmemberRelationship5(fMemberRelationship5);
		ybregister.setFmemberAppellation6(fMemberAppellation6);
		ybregister.setFmemberName6(fMemberName6);
		ybregister.setFmemberAge6(fMemberAge6);
		ybregister.setFmemberWorkInfo6(fMemberWorkInfo6);
		ybregister.setFmemberTel6(fMemberTel6);
		ybregister.setFmemberRelationship6(fMemberRelationship6);
		ybregister.setFmemberAppellation7(fMemberAppellation7);
		ybregister.setFmemberName7(fMemberName7);
		ybregister.setFmemberAge7(fMemberAge7);
		ybregister.setFmemberWorkInfo7(fMemberWorkInfo7);
		ybregister.setFmemberTel7(fMemberTel7);
		ybregister.setFmemberRelationship7(fMemberRelationship7);
		ybregister.setFmemberAppellation8(fMemberAppellation8);
		ybregister.setFmemberName8(fMemberName8);
		ybregister.setFmemberAge8(fMemberAge8);
		ybregister.setFmemberWorkInfo8(fMemberWorkInfo8);
		ybregister.setFmemberTel8(fMemberTel8);
		ybregister.setFmemberRelationship8(fMemberRelationship8);
		ybregister.setFamilyTotalPersonNum(familyTotalPersonNum);
		ybregister.setFamilyYearInCome(familyYearInCome);
		ybregister.setEconomicSources(economicSources);
		ybregister.setLeisureStyle(leisureStyle);
		ybregister.setOtherLeisureStyle(otherLeisureStyle);
		ybregister.setFarthestCity(farthestCity);
		ybregister.setClothingBrand(clothingBrand);
		ybregister.setAppearanceScore(appearanceScore);
		ybregister.setContactScore(contactScore);
		ybregister.setSelfConfidenceScore(selfConfidenceScore);
		ybregister.setHobby(hobby);
		ybregister.setMonthlyMoney(monthlyMoney);
		ybregister.setRemark(remark);
		
		ybregisterService.save(ybregister);
	}
	
	
}
