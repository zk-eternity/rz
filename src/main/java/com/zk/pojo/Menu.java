package com.zk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private Integer menu_id;
    private Integer parent_id;
    private String name;
    private String url;
    private String perms;
    private Integer type;
    private String icon;
    private Integer order_num;
}
