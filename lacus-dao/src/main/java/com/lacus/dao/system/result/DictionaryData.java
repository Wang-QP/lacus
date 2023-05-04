package com.lacus.dao.system.result;

import cn.hutool.core.util.StrUtil;
import com.lacus.dao.system.enums.interfaces.DictionaryEnum;
import lombok.Data;

/**
 * 字典模型类
 */
@Data
public class DictionaryData {

    private String label;
    private String value;
    private String cssTag;

    @SuppressWarnings("rawtypes")
    public DictionaryData(DictionaryEnum enumType) {
        if (enumType != null) {
            this.label = enumType.description();
            this.value = StrUtil.toString(enumType.getValue());
            this.cssTag = enumType.cssTag();
        }
    }

}
