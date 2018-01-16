package com.huanghongxi.chiguoguoservice.entity.condition;

import lombok.Data;

@Data
public class ProductCondition {

    private Integer recommendState; //推荐状态（0：普通商品，1：精选推荐）
    private Integer status;         //状态(0:上架 1:下架 2:售完)
    private String queryKey;        //搜索关键字
    private Integer page;           /*页码*/
    private Integer rows;           /*条数*/
    private Integer offset;         /*偏移量*/

    /**
     * 分页偏移量
     *
     * @return 偏移量
     */
    public Integer getOffset() {
        if (this.page != null && this.rows != null) {
            this.offset = (this.page - 1) * this.rows;
            return this.offset;
        }
        return this.offset;
    }
}
