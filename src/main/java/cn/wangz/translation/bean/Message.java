package cn.wangz.translation.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by hadoop on 2018/12/27.
 */
@Getter
@Setter
@ToString
public class Message {
    private String sourceCode;
    private String targetCode;
    private String sourceMsg;
    private String targetMsg;
}
