package cn.wangz.translation;

import cn.wangz.translation.bean.Message;
import cn.wangz.translation.translate.TranslateFactory;

/**
 * Created by hadoop on 2018/12/27.
 */
public class Main {
    public static void main(String[] args) {
        String source = "Using the Hello World guide, you’ll create a repository, start a branch, write comments, and open a pull request.";
        Message message = TranslateFactory.googleTranslate()
                .translate(source, "auto", "zh-CN");
        System.out.println(message);
    }
}
