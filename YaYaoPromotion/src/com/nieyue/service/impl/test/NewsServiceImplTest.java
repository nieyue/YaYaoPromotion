package com.nieyue.service.impl.test;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.nieyue.bean.News;
import com.nieyue.service.NewsService;
import com.nieyue.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/spring-dao.xml","classpath:config/spring-service.xml"})
@TransactionConfiguration(transactionManager="txManager",defaultRollback=false)
public class NewsServiceImplTest {
	@Resource
	NewsService newsService;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddNews() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelNews() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateNews() {
		fail("Not yet implemented");
	}

	@Test
	public void testLoadNews() {
		fail("Not yet implemented");
	}

	@Test
	public void testBrowseNews() {
		List<News> l = newsService.browseNews("奇闻","news_id", "asc");
		System.out.println(l.get(7).getContent());
		System.out.println(l.size());
	}

	@Test
	public void testBrowsePagingNews() {
		//List<News> l = newsService.browseNews("首页","news_id", "asc");
		List<News> l = newsService.browsePagingNews("首页", 10, 10, "news_id", "asc");
		System.out.println(l.size());
	}

}
