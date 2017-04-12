package cc.bitbank;

import cc.bitbank.entity.CandleType;
import cc.bitbank.entity.CurrencyPair;
import cc.bitbank.exception.BitbankException;

import java.util.Date;

/**
 * Created by tanaka on 2017/04/11.
 */
public class Example {
    public static void main(String args[]) {

        Bitbankcc bb = new Bitbankcc();
        try {
//            bb.getTicker(CurrencyPair.BTC_JPY);
//            bb.getDepth(CurrencyPair.BTC_JPY);
//            bb.getTransaction(CurrencyPair.BTC_JPY).transactions[0].price
//            bb.getTransaction(CurrencyPair.BTC_JPY, "20170410").transactions[0]
//            bb.getCandlestick(CurrencyPair.BTC_JPY, CandleType._1DAY, "2017").candlestick[0].getOhlcvList()

            System.out.println(
                    bb.getCandlestick(CurrencyPair.BTC_JPY, CandleType._1DAY, "2017").candlestick[0].getOhlcvList()
            );
        } catch (BitbankException e) {
            System.out.println(e.code);
        } catch (Exception e) {
            System.out.println("エラー " + e.getMessage());
            e.printStackTrace();
        }
    }
}