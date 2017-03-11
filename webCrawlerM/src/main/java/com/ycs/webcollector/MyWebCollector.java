package com.ycs.webcollector;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.berkeley.BreadthCrawler;
public class MyWebCollector extends BreadthCrawler {
	public MyWebCollector(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);	
	}
	public void visit(Page page, CrawlDatums next) {
        System.out.println("URL:" +page.getUrl() + "  title:" + page.getDoc().title());
//        Elements elements=page.select("#plist .p-price");
//        for(Element element:elements){
//        	System.out.println(element.html());
//        }
	}
	public static void main(String[] args) throws Exception {
     MyWebCollector crawler = new MyWebCollector("/tmp/crawler/db",true);
     crawler.addSeed("http://list.jd.com/list.html?cat=1319,1523,7052&page=1&go=0&JL=6_0_0");
     crawler.addRegex("http://item.jd.com/.*.html");
     crawler.setThreads(30);
     crawler.start(2);
	}

	
}
