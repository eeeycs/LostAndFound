相关概述（本项目是基于Maven管理，需要Maven的支持）
	parent:父项目
				引基本项目依赖（spring4,hibernate4,junit,fileupload,jackson,captcha,servlet,jsp,jstl,driver）
				配置项目编码，配置相关插件

				jcaptcha-2.0-alpha-1-SNAPSHOT.jar和jcaptcha-integration-simple-servlet-2.0-alpha-1-SNAPSHOT.jar在Maven的中央仓库可能下载不了，需要手动安装到本地仓库，这两个jar包在编译代码的shoplinuxM\WEB-INF\lib文件夹下，安装到本地仓库方法：
					@安装jcaptcha-2.0-alpha-1-SNAPSHOT.jar
						mvn install:install-file -DgroupId=com.octo.captcha -DartifactId=jcaptcha -Dversion=2.0-alpha-1-SNAPSHOT -Dpackaging=jar -Dfile=G:/javaEE/jar/jcaptcha/jcaptcha-2.0-alpha-1-SNAPSHOT.jar
		
					@安装jcaptcha-integration-simple-servlet-2.0-alpha-1-SNAPSHOT.jar
						mvn install:install-file -DgroupId=com.octo.captcha -DartifactId=jcaptcha-integration-simple-servlet -Dversion=2.0-alpha-1-SNAPSHOT -Dpackaging=jar -Dfile=G:/javaEE/jar/jcaptcha/jcaptcha-integration-simple-servlet-2.0-alpha-1-SNAPSHOT.jar

	coreM:核心项目
				封装基本DAO层，Service层,Filter层,exception层,Controller层
				封装常用工具类
				封装基本测试用例
				封装spring,hibernate的基本配置
	shoplinuxM:本项目
				继承parent项目
				依赖coreM项目
				在coreM项目的基础上进行相应开发

