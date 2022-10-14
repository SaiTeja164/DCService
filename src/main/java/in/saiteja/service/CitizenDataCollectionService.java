/**
 * 
 */
package in.saiteja.service;

import java.util.List;

import in.saiteja.binding.EduactionDetailsEntity;
import in.saiteja.binding.IncomeDetailsEntity;
import in.saiteja.binding.KidsDetailsEntity;
import in.saiteja.entity.CitizenDataCollectionEntity;

/**
 * @author K.SAITEJA
 *
 */
public interface CitizenDataCollectionService {
	
	// This method is to find if the id is avaliable or not for caseid creation
		public boolean findAppId(Integer appId);
		
		// This method is to create the caseNumber 
		public Integer caseNumberCreation(Integer caseId);
		
		// This method is to create get the income details of the citizen
		public IncomeDetailsEntity incomeDeatils(IncomeDetailsEntity incomeDetails);
		
		// This method is to create get the education details of the citizen
		public EduactionDetailsEntity educationDeatils(EduactionDetailsEntity eduactionDetails);
		
		// This method is to get the details of the kids 
		public List<KidsDetailsEntity> kidsDetails(KidsDetailsEntity kidsDetails);
		
		public CitizenDataCollectionEntity getCitizenDataCollection(Integer caseId);
}
