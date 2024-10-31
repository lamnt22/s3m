package vn.ses.s3m.plus.service;

import java.util.List;
import java.util.Map;

import vn.ses.s3m.plus.dto.Device;
import vn.ses.s3m.plus.dto.Forecast;
import vn.ses.s3m.plus.dto.OverviewLoadPower;
import vn.ses.s3m.plus.dto.OverviewLoadTotalPower;

public interface OverviewPowerService {

    OverviewLoadPower getPowers(Map<String, Object> condition);

    OverviewLoadTotalPower getTotalPowerInDay(Map<String, Object> condition);

    Map<String, String> getInformationProject(Map<String, Object> condition);

    List<Device> getListDeviceLoadByProjectId(Map<String, Object> condition);

    Forecast getForecast(Map<String, Object> condition);

    List<Forecast> getListForecast(Map<String, Object> condition);

    List<Forecast> getForecasts(Map<String, Object> condition);

    Integer countTotalForecasts(Map<String, Object> condition);

    void insertForecast(Map<String, Object> condition);

    void insertForecastHistory(Map<String, Object> condition);

    void updateForecast(Map<String, Object> condition);

    List<OverviewLoadPower> getDeviceHasWarning(Map<String, Object> condition);

    List<OverviewLoadPower> getLayer(Map<String, Object> condition);

    List<OverviewLoadTotalPower> getListPowerInDay(Map<String, Object> condition);

    Long getSumEnergy(Map<String, Object> condition);

    Long getSumEnergyByYear(Map<String, Object> condition);

    Long getSumEnergyByMonth(Map<String, Object> condition);

    Long getSumEnergyByDay(Map<String, Object> condition);
}
