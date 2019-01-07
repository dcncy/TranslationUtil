package cn.wangz.translation.translate;

/**
 * Created by hadoop on 2019/1/5.
 */
public class TranslateFactory {

    private static Translate GOOGLE_TRANSLATE = new GoogleTranslate();
    public static Translate googleTranslate() {
        return GOOGLE_TRANSLATE;
    }

}
