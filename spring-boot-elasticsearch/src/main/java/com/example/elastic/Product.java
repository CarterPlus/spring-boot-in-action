package com.example.elastic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "shopping")
@Setting(shards = 1, replicas = 1)
public class Product {
    /**
     * 必须有id，这里的id是全局唯一的标识，等同于es中的"_id"
     */
    @Id
    private Long id;
    /**
     * type: 字段数据类型
     * analyzer: 分词器类型
     * index: 是否索引（默认：true）
     * keyword: 短语，不进行分词
     */
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String title;
    @Field(type = FieldType.Keyword)
    private String category;
    @Field(type = FieldType.Double)
    private Double prices;
    @Field(type = FieldType.Keyword, index = false)
    private String images;

}
