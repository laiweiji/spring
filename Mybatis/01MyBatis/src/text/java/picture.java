import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 维吉的笔记本 on 2018/3/9.
 */
public class picture {

    @Test
    public  void mai(String html,String name) throws Exception {
        // TODO Auto-generated method stub
        download(html, name,"e://file");
    }

    public  void download(String urlString, String filename,String savePath) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        //设置请求超时为5s
        con.setConnectTimeout(5*1000);
        // 输入流
        InputStream is = con.getInputStream();

        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        File sf=new File(savePath);
        if(!sf.exists()){
            sf.mkdirs();
        }
        OutputStream os = new FileOutputStream(sf.getPath()+"\\"+filename);
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // 完毕，关闭所有链接
        os.close();
        is.close();
    }



    @Test
public void  cc() {


        String content = "<p><img alt= src=\"http://www.zuidaima.com/images/11/201401/20140116165317078.png\" style='height:421px; width:959px' /></p>"
                + "<p><img alt=\"\" src=\"http://www.zuidaima.com/images/11/201401/20140116165259325.png\" style=\"height:728px; width:1439px\" /></p>"
                + "<p><img src=\"http://pic3.zhimg.com/e3e3c4db741aa3325a719c9c405d9b96_b.jpg\" style=\"height:384px; width:969px\" /></p>";

        String imagePatternStr = "<img[\\w\\W]*?src=[\"|\']?([\\w\\W]*?)(jpg|png)[\\w\\W]*?/>";
        Pattern imagePattern = Pattern.compile(imagePatternStr,
                Pattern.CASE_INSENSITIVE);

        Matcher matcher = imagePattern.matcher(content);
        while (matcher.find()) {
            System.out.println("------------------------------------");
            // img整个标签
            String imageFragment = matcher.group(0);
            // img src中图片的url前缀
            String imageFragmentURL = matcher.group(1);
            // img src中图片的url后缀
            String imageFragmentSuffix = matcher.group(2);
            System.out.println("img标签:" + imageFragment + " url前缀:"
                    + imageFragmentURL + " url后缀:" + imageFragmentSuffix);
            System.out.println(imageFragmentURL+imageFragmentSuffix);
            System.out.println(imageFragmentURL+imageFragmentSuffix);
            System.out.println("------------------------------------\n");

        }

    }

}
