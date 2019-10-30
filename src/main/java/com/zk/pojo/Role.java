package com.zk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Integer role_id;
    private String role_name;
    private String remark;
    private Integer create_user_id;
    private Date create_time;
}
