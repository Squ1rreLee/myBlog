package org.pineconealliance.blog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 照片dto
 *
 * @Author Squ1rrel
 * @Date 2022/08/05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhotoDTO {
    /**
     * 相册封面
     */
    private String photoAlbumCover;
    /**
     * 相册名
     */
    private String photoAlbumName;
    /**
     * 照片列表
     */
    private List<String> photoList;
}
