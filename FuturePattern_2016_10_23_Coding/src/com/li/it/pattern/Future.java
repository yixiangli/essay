package com.li.it.pattern;

/**
 * �첽ģʽ
 * @author liyixiang
 *
 */
public class Future {

	public static void main(String[] args) {
		Client client = new Client();
		// ������������أ���Ϊ�õ�����FutureData������RealData
		Data data = client.request("name");
		System.out.println("�������");
		try {
			// ���������һ��sleep�����˶�����ҵ���߼��Ĵ���
			// �ڴ�����Щҵ���߼��Ĺ����У�RealData���������Ӷ���������˵ȴ�ʱ��
			Thread.sleep(200);
			System.out.println("����ҵ�������");
		} catch (InterruptedException e) {
		}
		// ʹ����ʵ������
		System.out.println("���� = " + data.getResult());
	}
}
