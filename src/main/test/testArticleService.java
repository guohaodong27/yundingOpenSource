import com.yunding.tools.MyConst;
import com.yunding.dao.entities.ArticleExtend;
import com.yunding.service.ArticleService;
import com.yunding.tools.UUIDTools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

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

    @Test
    public void testArticleSave(){
        ArticleExtend articleExtend = new ArticleExtend();
        articleExtend.setArticleContent("favorite");
        articleExtend.setArticleId(UUIDTools.getUUID());
        articleExtend.setUserId(UUIDTools.getUUID());

        articleService.saveArticle(articleExtend);
    }

    @Test
    public void testArticleDel(){
        articleService.deleteArticle("5B1F83D29A414EA3BBF71D214F5832AE");
    }

    @Test
    public void testArticleFav() {
        articleService.favorite("724765914AB545428A351C0C989135FB","93A68A89782A4EA4A1866C06DC56CD98");
    }

    @Test
    public void testArticlePra() {
        articleService.praise("0638120EE51F4193A97383AA19A0F495");

    }
}
