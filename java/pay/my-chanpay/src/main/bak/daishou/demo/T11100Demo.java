package com.chanpay.dsf.demo;

import java.util.Map;

import com.chanpay.demo.util.BaseConstant;
import com.chanpay.demo.util.BaseParameter;
import com.chanpay.demo.util.ChanPayUtil;

/**
 * 
 * @ClassName: T11100Demo
 * @Description: 批量付款接口 Demo
 * @author yanghta yanghta@chanjet.com
 * @date 2017年5月3日 下午3:53:16
 *
 */
public class T11100Demo extends BaseParameter {

	public void send() {
		Map<String, String> map = this.requestBaseParameter();
		map.put("TransCode", "T11100"); // 交易码
		map.put("OutTradeNo", ChanPayUtil.generateOutTradeNo()); // 商户网站唯一订单号
		map.put("CorpAcctNo", "62233333333333"); // 企业账号 （T环境）
		map.put("BusinessType", "0"); // 业务类型
		map.put("CorpCheckNo", "201703061413");
		map.put("CorpPushUrl", "http://172.20.11.16");
		map.put("TotalNum", "2");
		map.put("TotalAmt", "12");
		
		//(此处需要用真实的账号信息)
		//批量交易所有项(DetailNo:同一个请求内必须唯一。建议使用全局唯一的数值；如：UUID)
//		map.put("ProdInfoList",
//				"[{'DetailNo':'2017050810253641570867548504','TransAmt':'6','BankCommonName':'中国建设银行','AccountType':'00','AcctNo':'6217000010072384780','AcctName':'李四','Province':'甘肃省','City':'兰州市','BranchBankName':'中国建设银行股份有限公司兰州新港城支行','BranchBankCode':'105821005604','DrctBankCode':'105821005604','Currency':'CNY','LiceneceType':'01','LiceneceNo':'600000201703160001','Phone':'18219910000','AcctExp':'','AcctCvv2':'','Summary':'备注','Postscript':'用途'}]");
		//批量可空项
//		map.put("ProdInfoList",
//				"[{'DetailNo':'2017050810253641570867548506','TransAmt':'6','BankCommonName':'中国建设银行','AccountType':'00','AcctNo':'6217000010072384780','AcctName':'李四','Province':'','City':'','BranchBankName':'','BranchBankCode':'','DrctBankCode':'','Currency':'','LiceneceType':'','LiceneceNo':'','Phone':'','AcctExp':'','AcctCvv2':'','Summary':'备注','Postscript':'用途'}]");
		//批量多笔，多笔需要用逗号隔开
		map.put("ProdInfoList",
				"[{'DetailNo':'2017050810253641570867548508','TransAmt':'6','BankCommonName':'中国建设银行','AccountType':'00','AcctNo':'6217000010000000000','AcctName':'李四','Province':'','City':'','BranchBankName':'','BranchBankCode':'','DrctBankCode':'','Currency':'','LiceneceType':'','LiceneceNo':'','Phone':'','AcctExp':'','AcctCvv2':'','Summary':'备注','Postscript':'用途'},{'DetailNo':'2017050810253641570867548509','TransAmt':'6','BankCommonName':'中国建设银行','AccountType':'00','AcctNo':'6217000010000000000','AcctName':'张三','Province':'','City':'','BranchBankName':'','BranchBankCode':'','DrctBankCode':'','Currency':'','LiceneceType':'','LiceneceNo':'','Phone':'','AcctExp':'','AcctCvv2':'','Summary':'备注','Postscript':'用途'}]");

		ChanPayUtil.sendPost(map, BaseConstant.CHARSET,
				BaseConstant.MERCHANT_PRIVATE_KEY);
	}
	
	@org.junit.Test
	public void testSend() {
		T11100Demo demo = new T11100Demo();
		demo.send();
	}		

}
