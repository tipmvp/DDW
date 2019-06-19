package cn.ddw.pictureUploadServiceImpl.serivce;

import cn.ddw.pictureUploadServiceImpl.entity.Picture;

import java.util.List;

public interface PictureService {

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