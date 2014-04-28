package org.guess.showcase.cms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.guess.core.IdEntity;
import org.guess.core.utils.DateUtil;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 文章Entity
 * @author ThinkGem
 * @version 2013-05-15
 */
@Entity
@Table(name = "cms_article")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Article extends IdEntity {
	
	private String title;			// 标题
	private String color;			// 标题颜色（red：红色；green：绿色；blue：蓝色；yellow：黄色；orange：橙色）
	private String image;			// 文章图片
	private String keywords;		// 关键字
	private String description;		// 描述、摘要
	private Integer weight;			// 权重，越大越靠前
	private Integer hits;			// 点击数
	private Integer isWord = 0;		//是否是word解析方式时为0,不是为1
	private String content;			//不用word解析时添加富文本内容
	private String htmlid;			//通过word解析为html方式的html文件路劲
	
	/**
	 * 发表日期
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date createDate = DateUtil.parseFormat("yyyy-MM-dd");
	
	public String getHtmlid() {
		return htmlid;
	}
	public void setHtmlid(String htmlid) {
		this.htmlid = htmlid;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Integer getIsWord() {
		return isWord;
	}
	public void setIsWord(Integer isWord) {
		this.isWord = isWord;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getHits() {
		return hits;
	}
	public void setHits(Integer hits) {
		this.hits = hits;
	}

}

