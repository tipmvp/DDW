package cn.ddw.pictureUploadServiceImpl.dao;

import cn.ddw.pictureUploadServiceImpl.entity.Picture ;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PictureDao{
    /**
     * 删
     * @param id
     */
    void deletePicture(Integer id);

    /**
     * 改
     * @param picture
     */
    void updatePicture(Picture picture);

    /**
     * 查
     * @param id
     * @return
     */
    Picture getPicture(Integer id);

    /**
     * 增
     * @param picture
     */
    void insertPicture(Picture picture);

    /**
     * 全
     * @return
     */
    List<Picture> getAllPictures();
}