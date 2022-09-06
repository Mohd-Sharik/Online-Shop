package UtilModel;

import javax.ws.rs.QueryParam;


public class FilterParameter {
	
	// most common
		private @QueryParam("pageIndex") Integer pageIndex = 0;
		private @QueryParam("pageName") String pageName = "";
		private @QueryParam("recordToShowOnOnePage") Integer recordToShowOnOnePage = 25;
		private @QueryParam("recordTotal") Long recordTotal;
		private @QueryParam("id") String id = "";
		private @QueryParam("refCd") String refCd = "";
		
		
		
		
		
		public Integer getPageIndex() {
			return pageIndex;
		}
		public void setPageIndex(Integer pageIndex) {
			this.pageIndex = pageIndex;
		}
		public String getPageName() {
			return pageName;
		}
		public void setPageName(String pageName) {
			this.pageName = pageName;
		}
		public Integer getRecordToShowOnOnePage() {
			return recordToShowOnOnePage;
		}
		public void setRecordToShowOnOnePage(Integer recordToShowOnOnePage) {
			this.recordToShowOnOnePage = recordToShowOnOnePage;
		}
		public Long getRecordTotal() {
			return recordTotal;
		}
		public void setRecordTotal(Long recordTotal) {
			this.recordTotal = recordTotal;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getRefCd() {
			return refCd;
		}
		public void setRefCd(String refCd) {
			this.refCd = refCd;
		}
		
		
		

}
