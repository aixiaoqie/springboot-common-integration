//package com.ssw.sharding.config;
//
//
//import org.apache.shardingsphere.driver.api.ShardingSphereDataSourceFactory;
//import org.apache.shardingsphere.infra.config.RuleConfiguration;
//import org.apache.shardingsphere.replicaquery.api.config.rule.ReplicaQueryDataSourceRuleConfiguration;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.*;
//
//public class ShardingJdbcConfig {
//
//    @Autowired
//    private DatabaseMasterConfig databaseMasterConfig;
//
//    @Autowired
//    private DatabaseSlaveConfig databaseSlaveConfig;
//
//    /**
//     * 获取数据源
//     *
//     * @return
//     */
//    @Bean
//    public DataSource getDataSource() throws SQLException {
//        return buildDataSource();
//    }
//
//    public DataSource buildDataSource() throws SQLException {
//        // 构建主库数据源
//        Map<String, DataSource> masterDataSourceMap = new HashMap<>();
//        masterDataSourceMap.put(databaseMasterConfig.getDatabaseName(), databaseMasterConfig.createDataSource());
//
//        // 构建从库数据源
//        Map<String, DataSource> slaveDataSourceMap = new HashMap<>();
//        slaveDataSourceMap.put(databaseSlaveConfig.getDatabaseName(), databaseSlaveConfig.createDataSource());
//
//        //从库数据源名称列表
//        List<String> slaveList = new ArrayList<>();
//        slaveList.add(databaseSlaveConfig.getDatabaseName());
//
//        // 构建配置规则
//        /*
//        主从数据源配置
//        类名称：ReplicaQueryDataSourceRuleConfiguration
//        可配置属性：
//                 名称	数据类型	说明	默认值
//                 name	String	读写分离数据源名称	-
//                 primaryDataSourceName	String	主库数据源名称	-
//                 replicaDataSourceNames (+)	Collection<String>	从库数据源名称列表	-
//                 loadBalancerName (?)	String	从库负载均衡算法名称	轮询负载均衡算法
//         */
//
////        Collection<RuleConfiguration> configurations = new ReplicaQueryDataSourceRuleConfiguration("test", databaseMasterConfig.getDatabaseName(),slaveList,)
//        Collection<RuleConfiguration> configurations = null;
//                // 构建属性配置
//        Properties props = null;
//
//        DataSource dataSource = ShardingSphereDataSourceFactory.createDataSource(slaveDataSourceMap, configurations, props);
//        return dataSource;
//
//    }
//}
