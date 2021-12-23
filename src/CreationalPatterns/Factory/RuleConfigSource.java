package CreationalPatterns.Factory;

/**
 * @author wuliang
 * 需求: 根据不同的配置文件后缀，选择不同的解析器。
 */
public class RuleConfigSource {

    private String getFileExtension(String filePath){
        return "json";
    }
}
