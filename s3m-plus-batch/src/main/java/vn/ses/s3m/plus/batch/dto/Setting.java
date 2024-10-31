package vn.ses.s3m.plus.batch.dto;

import lombok.Data;

@Data
public class Setting {

    private Integer settingId;

    private Integer deviceId;

    private Integer projectId;

    private Integer customerId;

    private Integer type;

    private Integer settingMstId;

    private String settingMstName;

    private String settingValue;

    private String settingValue2;

    private Integer warningType;

    private String description;

    private String updateDate;

    private String settingDate;

    private Integer warningLevel;

}
