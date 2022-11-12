package org.pineconealliance.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.pineconealliance.blog.dto.PhotoAlbumBackDTO;
import org.pineconealliance.blog.dto.PhotoAlbumDTO;
import org.pineconealliance.blog.entity.PhotoAlbum;
import org.pineconealliance.blog.vo.ConditionVO;
import org.pineconealliance.blog.vo.PageResult;
import org.pineconealliance.blog.vo.PhotoAlbumVO;

import java.util.List;

/**
 * 相册服务
 *
 * @Author Squ1rrel
 * @Date 2022/08/04
 */
public interface PhotoAlbumService extends IService<PhotoAlbum> {
    /**
     * 保存或更新相册
     *
     * @param photoAlbumVO 相册信息
     */
    void saveOrUpdatePhotoAlbum(PhotoAlbumVO photoAlbumVO);

    /**
     * 查看后台相册列表
     *
     * @param condition 条件
     * @return {@link PageResult < PhotoAlbumBackDTO >} 相册列表
     */
    PageResult<PhotoAlbumBackDTO> listPhotoAlbumBacks(ConditionVO condition);

    /**
     * 获取后台相册列表信息
     *
     * @return {@link List< PhotoAlbumDTO >} 相册列表信息
     */
    List<PhotoAlbumDTO> listPhotoAlbumBackInfos();

    /**
     * 根据id获取相册信息
     *
     * @param albumId 相册id
     * @return {@link PhotoAlbumBackDTO} 相册信息
     */
    PhotoAlbumBackDTO getPhotoAlbumBackById(Integer albumId);

    /**
     * 根据id删除相册
     *
     * @param albumId 相册id
     */
    void deletePhotoAlbumById(Integer albumId);

    /**
     * 获取相册列表
     *
     * @return {@link List<PhotoAlbumDTO>}相册列表
     */
    List<PhotoAlbumDTO> listPhotoAlbums();
}
