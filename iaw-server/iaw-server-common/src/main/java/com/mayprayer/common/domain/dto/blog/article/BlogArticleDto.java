package com.mayprayer.common.domain.dto.blog.article;

import com.mayprayer.common.domain.BlogArticle;
import com.mayprayer.common.domain.BlogArticleContent;
import com.mayprayer.common.domain.BlogTagArticle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 一篇文章 所属一个分类   有多个标签   只有一个主体内容
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlogArticleDto {

    /**
     * 文章标题描述等
     */
    private BlogArticle blogArticle;

    /**
     * 文章主题内容
     */
    private BlogArticleContent blogArticleContent;


    /**
     * 标签id集合
     *
     */
    private List<BlogTagArticle> blogTagArticleList;

}
