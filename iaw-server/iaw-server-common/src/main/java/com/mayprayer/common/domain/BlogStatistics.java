package com.mayprayer.common.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* 统计
* @TableName blog_statistics
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BlogStatistics extends  BaseDomain{


    private Long viewDayNum;

    private Long commentsDayNum;

    private Long articleDayNum;


}
