package com.xidian.community.cache;

import com.xidian.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TagCache {
    public static List<TagDTO> get() {
        List<TagDTO> tagDTOS = new ArrayList<>();
        TagDTO program = new TagDTO();
        program.setCategoryName("学习资料");
        program.setTags(Arrays.asList("考研书籍", "课本", "课外书", "专业书籍资料", "学习用具", "其它"));
        tagDTOS.add(program);

        TagDTO server = new TagDTO();
        server.setCategoryName("电子产品");
        server.setTags(Arrays.asList("手机", "电脑", "键盘", "鼠标", "ipad", "手表", "其它"));
        tagDTOS.add(server);

        TagDTO db = new TagDTO();
        db.setCategoryName("运动器材");
        db.setTags(Arrays.asList("羽毛球拍", "篮球", "足球", "乒乓球", "其它"));
        tagDTOS.add(db);

        TagDTO tool = new TagDTO();
        tool.setCategoryName("生活用品");
        tool.setTags(Arrays.asList("衣服", "鞋子", "裤子", "外套", "生活工具", "其它"));
        tagDTOS.add(tool);

        TagDTO framework = new TagDTO();
        framework.setCategoryName("其它");
        framework.setTags(Arrays.asList("其它"));
        tagDTOS.add(framework);


        return tagDTOS;
    }

    public static String filterInvalid(String tags) {
        String[] split = StringUtils.split(tags, ",");
        List<TagDTO> tagDTOS = get();

        List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
        String invalid = Arrays.stream(split).filter(t -> StringUtils.isBlank(t) || !tagList.contains(t)).collect(Collectors.joining(","));
        return invalid;
    }

    public static void main(String[] args) {
        int i = (5 - 1) >>> 1;
        System.out.println(i);
    }
}
