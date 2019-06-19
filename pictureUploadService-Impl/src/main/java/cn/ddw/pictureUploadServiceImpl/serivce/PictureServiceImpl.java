package cn.ddw.pictureUploadServiceImpl.serivce;

import cn.ddw.pictureUploadServiceImpl.dao.PictureDao ;
import cn.ddw.pictureUploadServiceImpl.entity.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements PictureService{
	
	@Autowired
	private PictureDao pictureDao;

	@Override
	public void deletePicture(Integer id) {
		pictureDao.deletePicture(id);
	}

	@Override
	public void updatePicture(Picture picture) {
		pictureDao.updatePicture(picture);
	}

	@Override
	public Picture getPicture(Integer id) {
		return pictureDao.getPicture(id);
	}

	@Override
	public void insertPicture(Picture picture) {
		pictureDao.insertPicture(picture);
	}

	@Override
	public List<Picture> getAllPictures() {
		return pictureDao.getAllPictures();
	}
	

}
