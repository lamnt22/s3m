package vn.ses.s3m.plus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import vn.ses.s3m.plus.dto.Chart;

@Mapper
public interface ChartMapper {

    List<Chart> getChartLoadCostByCustomerId(Map<String, Object> condition);

    List<Chart> getChartLoadSumCostByDay(Map<String, Object> condition);
    
    List<Chart> getChartSolarCostByCustomerId(Map<String, Object> condition);

    List<Chart> getChartSolarSumCostByDay(Map<String, Object> condition);

    List<Chart> getChartGridCostByCustomerId(Map<String, Object> condition);

    List<Chart> getChartGridSumCostByDay(Map<String, Object> condition);

    List<Chart> getChartLoadByHour(Map<String, Object> condition);

    List<Chart> getChartInverterByHour(Map<String, Object> condition);

    List<Chart> getChartRmuByHour(Map<String, Object> condition);

    List<Chart> getChartLoadPower(Map<String, Object> condition);

    List<Chart> getChartInverterPower(Map<String, Object> condition);

    List<Chart> getChartRmuPower(Map<String, Object> condition);
    
    List<Chart> getChartLoadSumCostByYear(Map<String, Object> condition);
    
    List<Chart> getChartSolarSumCostByYear(Map<String, Object> condition);
    
    List<Chart> getChartGridSumCostByYear(Map<String, Object> condition);
    
    List<Chart> getChartLoadCostHomePage(Map<String, Object> condition);

    List<Chart> getChartSolarCostHomePage(Map<String, Object> condition);

    List<Chart> getChartGridCostHomePage(Map<String, Object> condition);
    
    List<Chart> getChartLoadSumCostHomePage(Map<String, Object> condition);
    
    List<Chart> getChartSolarSumCostHomePage(Map<String, Object> condition);

    List<Chart> getChartGridSumCostHomePage(Map<String, Object> condition);
    
    List<Chart> getChartTemperature(Map<String, Object> condition); 
    
    List<Chart> getChartSankey(Map<String, Object> condition);
    
    List<Chart> getChartDischargeIndicatorHtr02(Map<String, Object> condition);
    
    List<Chart> getChartDischargeIndicatorAms01(Map<String, Object> condition);
 
}
