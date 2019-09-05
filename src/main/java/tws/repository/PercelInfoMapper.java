package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.PercelInfo;

@Mapper
public interface PercelInfoMapper {

	void insert(@Param("percelInfo") PercelInfo percelInfo);

}
