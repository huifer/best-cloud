package org.shanzhaozhen.bestcloudcommon.enums.sys;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.shanzhaozhen.bestcloudcommon.param.EnumParam;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum DictionaryType {

    KID("类型" ,0),
    VALUE("值" ,1);

    private String name;

    private Integer value;

    public static List<EnumParam> toList() {
        List<EnumParam> list = new ArrayList<>();
        for (DictionaryType dictionaryType : DictionaryType.values()) {
            EnumParam enumParam = new EnumParam(dictionaryType.getName(), dictionaryType.getValue());
            list.add(enumParam);
        }
        return list;
    }
}
