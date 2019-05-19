import com.yunding.MyConst;
import com.yunding.dao.entities.ArticleExtend;
import com.yunding.service.ArticleService;
import com.yunding.service.Impl.ArticleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class testArticleService {

    @Resource
    private ArticleService articleService;
    @Resource
    private MyConst myConst;
    @Test
    public void testListArticle(){
        List<ArticleExtend> articleExtends = articleService.listArticle(0);

    }

}
