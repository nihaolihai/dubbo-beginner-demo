这是基于zookeeper和dubbo做服务的提供与消费
provider提供者//com.alibaba.dubbo.config.annotation.Service
@Service(timeout = 6000,version = "test")//指定版本号及超时时间
@Component
consumer消费者
@Reference(version = "test")
IHelloService ihelloService;