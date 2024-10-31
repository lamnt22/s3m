package vn.ses.s3m.plus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.ses.s3m.plus.dao.DataStringMapper;
import vn.ses.s3m.plus.dto.DataString1;

@Service
public class OperationStringPVServiceImpl implements OperationStringPVService {

    @Autowired
    private DataStringMapper dataStringMapper;

    /**
     * Lấy dữ liệu vận hành String tức thời PV
     *
     * @param condition Điều kiện truy vấn
     * @return Dữ liệu tức thời
     */
    @Override
    public DataString1 getInstantOperationStringPV(final Map<String, Object> condition) {
        return dataStringMapper.getInstantOperationStringPV(condition);
    }

    /**
     * Lấy danh sách dữ liệu vận hành String PV
     *
     * @param condition Điều kiện truy vấn
     * @return Danh sách dữ liệu tức thời
     */
    @Override
    public List<DataString1> getOperationStringPV(final Map<String, Object> condition) {
        return dataStringMapper.getOperationStringPV(condition);
    }

    /**
     * Lấy tổng số dữ liệu vận hành String
     *
     * @param condition Điều kiện truy vấn
     * @return Số lượng dữ liệu
     */
    @Override
    public Integer countDataOperationStringPV(final Map<String, Object> condition) {
        return dataStringMapper.countDataOperationStringPV(condition);
    }

}
