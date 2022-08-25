package logginShopLogging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.EntryMessage;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;

public class ILogger implements Logger {
	
	private Logger logger = null;

	public ILogger(Class<?> logClass) {
		logger = LogManager.getLogger(logClass);
	}

	@Override
	public void catching(Level level, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.catching(level, throwable);
		
	}

	@Override
	public void catching(Throwable throwable) {
		// TODO Auto-generated method stub
		logger.catching(throwable);
		
	}

	@Override
	public void debug(Marker marker, Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message);
		}
		
	}

	@Override
	public void debug(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, throwable);
		}
		
	}

	@Override
	public void debug(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, messageSupplier);
		}
		
	}

	@Override
	public void debug(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void debug(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message);
		}
		
	}

	@Override
	public void debug(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, throwable);
		}
		
	}

	@Override
	public void debug(Marker marker, Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message);
		}
		
	}

	@Override
	public void debug(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, throwable);
		}
		
	}

	@Override
	public void debug(Marker marker, String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, params);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, paramSuppliers);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, throwable);
		}
		
	}

	@Override
	public void debug(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, messageSupplier);
		}
		
	}

	@Override
	public void debug(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void debug(Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message);
		}
		
	}

	@Override
	public void debug(Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, throwable);
		}
		
	}

	@Override
	public void debug(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(messageSupplier);
		}
		
	}

	@Override
	public void debug(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(messageSupplier, throwable);
		}
		
	}

	@Override
	public void debug(CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message);
		}
		
	}

	@Override
	public void debug(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, throwable);
		}
		
	}

	@Override
	public void debug(Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message);
		}
		
	}

	@Override
	public void debug(Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, throwable);
		}
		
	}

	@Override
	public void debug(String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message);
		}
		
	}

	@Override
	public void debug(String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, params);
		}
		
	}

	@Override
	public void debug(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, paramSuppliers);
		}
		
	}

	@Override
	public void debug(String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, throwable);
		}
		
	}

	@Override
	public void debug(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(messageSupplier);
		}
		
	}

	@Override
	public void debug(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(messageSupplier, throwable);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0, p1);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0, p1, p2);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8);
		}
		
	}

	@Override
	public void debug(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8,p9);
		}
		
	}

	@Override
	public void debug(String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0);
		}
		
	}

	@Override
	public void debug(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0, p1);
		}
		
	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0, p1, p2);
		}
		
	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0, p1, p2, p3, p4, p5, p6, p5);
		}
		
	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
		}
		
	}

	@Override
	public void debug(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.debug(message, p0, p1, p2, p3, p4, p5, p6, p7, p8,p9);
		}
		
	}

	@Override
	public void entry() {
		// TODO Auto-generated method stub
		logger.entry();
		
	}

	@Override
	public void entry(Object... params) {
		// TODO Auto-generated method stub
		logger.entry(params);
		
	}

	@Override
	public void error(Marker marker, Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message);
		}
		
	}

	@Override
	public void error(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, throwable);
		}
		
	}

	@Override
	public void error(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, messageSupplier);
		}
		
	}

	@Override
	public void error(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void error(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message);
		}
		
	}

	@Override
	public void error(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, throwable);
		}
		
	}

	@Override
	public void error(Marker marker, Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message);
		}
		
	}

	@Override
	public void error(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, throwable);
		}
		
	}

	@Override
	public void error(Marker marker, String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.DEBUG))
		{
			logger.error(marker, message, params);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, paramSuppliers);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, throwable);
		}
		
	}

	@Override
	public void error(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, messageSupplier);
		}
		
	}

	@Override
	public void error(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void error(Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message);
		}
		
	}

	@Override
	public void error(Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, throwable);
		}
		
	}

	@Override
	public void error(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(messageSupplier);
		}
		
	}

	@Override
	public void error(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(messageSupplier, throwable);
		}
		
	}

	@Override
	public void error(CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message);
		}
		
	}

	@Override
	public void error(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, throwable);
		}
		
	}

	@Override
	public void error(Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message);
		}
		
	}

	@Override
	public void error(Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, throwable);
		}
		
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message);
		}
		
	}

	@Override
	public void error(String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, params);
		}
		
	}

	@Override
	public void error(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, paramSuppliers);
		}
		
	}

	@Override
	public void error(String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, throwable);
		}
		
	}

	@Override
	public void error(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(messageSupplier);
		}
		
	}

	@Override
	public void error(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(messageSupplier, throwable);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0, p1);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0, p1, p2);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8);
		}
		
	}

	@Override
	public void error(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8,p9);
		}
		
	}

	@Override
	public void error(String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, p0);
		}
		
	}

	@Override
	public void error(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, p0,p1);
		}
		
	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, p0,p1,p2);
		}
		
	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, p0,p1,p2,p3);
		}
		
	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message,p0,p1,p2,p3,p4);
		}
		
	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
		}
		
	}

	@Override
	public void error(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.ERROR))
		{
			logger.error(message, p0, p1, p2, p3, p4, p5, p6, p7, p8,p9);
		}
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		logger.exit();
		
	}

	@Override
	public <R> R exit(R result) {
		// TODO Auto-generated method stub
		return logger.exit(result);
	}

	@Override
	public void fatal(Marker marker, Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message);
		}
		
	}

	@Override
	public void fatal(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, throwable);
		}
		
	}

	@Override
	public void fatal(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, messageSupplier);
		}
		
	}

	@Override
	public void fatal(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void fatal(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message);
		}
		
	}

	@Override
	public void fatal(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, throwable);
		}
		
	}

	@Override
	public void fatal(Marker marker, Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message);
		}
		
	}

	@Override
	public void fatal(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, throwable);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, params);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, paramSuppliers);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, throwable);
		}
		
	}

	@Override
	public void fatal(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, messageSupplier);
		}
		
	}

	@Override
	public void fatal(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void fatal(Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message);
		}
		
	}

	@Override
	public void fatal(Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, throwable);
		}
		
	}

	@Override
	public void fatal(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(messageSupplier);
		}
		
	}

	@Override
	public void fatal(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(messageSupplier, throwable);
		}
	}

	@Override
	public void fatal(CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message);
		}
		
	}

	@Override
	public void fatal(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, throwable);
		}
		
	}

	@Override
	public void fatal(Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message);
		}
		
	}

	@Override
	public void fatal(Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, throwable);
		}
		
	}

	@Override
	public void fatal(String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message);
		}
		
	}

	@Override
	public void fatal(String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, params);
		}
		
	}

	@Override
	public void fatal(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, paramSuppliers);
		}
		
	}

	@Override
	public void fatal(String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, throwable);
		}
		
	}

	@Override
	public void fatal(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(messageSupplier);
		}
		
	}

	@Override
	public void fatal(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(messageSupplier, throwable);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0, p1);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0, p1, p2);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8);
		}
		
	}

	@Override
	public void fatal(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8,p9);
		}
		
	}

	@Override
	public void fatal(String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0);
		}
		
	}

	@Override
	public void fatal(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0, p1);
		}
		
	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0, p1, p2);
		}
		
	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
		}
		
	}

	@Override
	public void fatal(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.FATAL))
		{
			logger.fatal(message, p0, p1, p2, p3, p4, p5, p6, p7, p8,p9);
		}
		
	}

	@Override
	public Level getLevel() {
		// TODO Auto-generated method stub
		return logger.getLevel();
	}

	@Override
	public <MF extends MessageFactory> MF getMessageFactory() {
		// TODO Auto-generated method stub
		return logger.getMessageFactory();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return logger.getName();
	}

	@Override
	public void info(Marker marker, Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message);
		}
		
	}

	@Override
	public void info(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, throwable);
		}
		
	}

	@Override
	public void info(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, messageSupplier);
		}
		
	}

	@Override
	public void info(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void info(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message);
		}
		
	}

	@Override
	public void info(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, throwable);
		}
		
	}

	@Override
	public void info(Marker marker, Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message);
		}
		
	}

	@Override
	public void info(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, throwable);
		}
		
	}

	@Override
	public void info(Marker marker, String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, params);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, paramSuppliers);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			
			logger.info(marker, message, throwable);
		}
		
	}

	@Override
	public void info(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, messageSupplier);
		}
		
	}

	@Override
	public void info(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void info(Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message);
		}
		
	}

	@Override
	public void info(Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, throwable);
		}
		
	}

	@Override
	public void info(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(messageSupplier);
		}
		
	}

	@Override
	public void info(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(messageSupplier, throwable);
		}
		
	}

	@Override
	public void info(CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message);
		}
		
	}

	@Override
	public void info(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, throwable);
		}
		
	}

	@Override
	public void info(Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message);
		}
		
	}

	@Override
	public void info(Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, throwable);
		}
		
	}

	@Override
	public void info(String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message);
		}
		
	}

	@Override
	public void info(String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, params);
		}
		
	}

	@Override
	public void info(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, paramSuppliers);
		}
		
	}

	@Override
	public void info(String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, throwable);
		}
		
	}

	@Override
	public void info(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(messageSupplier);
		}
		
	}

	@Override
	public void info(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(messageSupplier, throwable);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0, p1);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0, p1, p2);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8);
		}
		
	}

	@Override
	public void info(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8,p9);
		}
		
	}

	@Override
	public void info(String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0);
		}
		
	}

	@Override
	public void info(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0, p1);
		}
		
	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0, p1, p2);
		}
		
	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
		}
		
	}

	@Override
	public void info(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.INFO))
		{
			logger.info(message, p0, p1, p2, p3, p4, p5, p6, p7, p8,p9);
		}
		
	}

	@Override
	public boolean isDebugEnabled() {
		// TODO Auto-generated method stub
		return logger.isDebugEnabled();
	}

	@Override
	public boolean isDebugEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return logger.isDebugEnabled(marker);
	}

	@Override
	public boolean isEnabled(Level level) {
		// TODO Auto-generated method stub
		return logger.isEnabled(level);
	}

	@Override
	public boolean isEnabled(Level level, Marker marker) {
		// TODO Auto-generated method stub
		return logger.isEnabled(level, marker);
	}

	@Override
	public boolean isErrorEnabled() {
		// TODO Auto-generated method stub
		return logger.isErrorEnabled();
	}

	@Override
	public boolean isErrorEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return logger.isErrorEnabled(marker);
	}

	@Override
	public boolean isFatalEnabled() {
		// TODO Auto-generated method stub
		return logger.isFatalEnabled();
	}

	@Override
	public boolean isFatalEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return logger.isFatalEnabled(marker);
	}

	@Override
	public boolean isInfoEnabled() {
		// TODO Auto-generated method stub
		return logger.isInfoEnabled();
	}

	@Override
	public boolean isInfoEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return logger.isInfoEnabled(marker);
	}

	@Override
	public boolean isTraceEnabled() {
		// TODO Auto-generated method stub
		return logger.isTraceEnabled();
	}

	@Override
	public boolean isTraceEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return logger.isTraceEnabled(marker);
	}

	@Override
	public boolean isWarnEnabled() {
		// TODO Auto-generated method stub
		return logger.isWarnEnabled();
	}

	@Override
	public boolean isWarnEnabled(Marker marker) {
		// TODO Auto-generated method stub
		return logger.isWarnEnabled(marker);
	}

	@Override
	public void log(Level level, Marker marker, Message message) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message);
		
	}

	@Override
	public void log(Level level, Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, throwable);
		
	}

	@Override
	public void log(Level level, Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		logger.log(level, marker, messageSupplier);
		
	}

	@Override
	public void log(Level level, Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, marker, messageSupplier, throwable);
		
	}

	@Override
	public void log(Level level, Marker marker, CharSequence message) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message);
		
	}

	@Override
	public void log(Level level, Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, throwable);
		
	}

	@Override
	public void log(Level level, Marker marker, Object message) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message);
		
	}

	@Override
	public void log(Level level, Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, throwable);
		
	}

	@Override
	public void log(Level level, Marker marker, String message) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, params);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, paramSuppliers);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, throwable);
		
	}

	@Override
	public void log(Level level, Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		logger.log(level, marker, messageSupplier);
		
	}

	@Override
	public void log(Level level, Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, marker, messageSupplier, throwable);
		
	}

	@Override
	public void log(Level level, Message message) {
		// TODO Auto-generated method stub
		logger.log(level, message);
		
	}

	@Override
	public void log(Level level, Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, message, throwable);
		
	}

	@Override
	public void log(Level level, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		logger.log(level, messageSupplier);
		
	}

	@Override
	public void log(Level level, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, messageSupplier, throwable);
		
	}

	@Override
	public void log(Level level, CharSequence message) {
		// TODO Auto-generated method stub
		logger.log(level, message);
		
	}

	@Override
	public void log(Level level, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, message, throwable);
		
	}

	@Override
	public void log(Level level, Object message) {
		// TODO Auto-generated method stub
		logger.log(level, message);
		
	}

	@Override
	public void log(Level level, Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, message, throwable);
		
	}

	@Override
	public void log(Level level, String message) {
		// TODO Auto-generated method stub
		logger.log(level, message);
		
	}

	@Override
	public void log(Level level, String message, Object... params) {
		// TODO Auto-generated method stub
		logger.log(level, message, params);
		
	}

	@Override
	public void log(Level level, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		logger.log(level, message, paramSuppliers);
		
	}

	@Override
	public void log(Level level, String message, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, message, throwable);
		
	}

	@Override
	public void log(Level level, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		logger.log(level, messageSupplier);
		
	}

	@Override
	public void log(Level level, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		logger.log(level, messageSupplier, throwable);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0, p1);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0, p1, p2);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0, p1, p2, p3);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0, p1, p2, p3, p4);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0, p1, p2, p3, p4, p5);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0, p1, p2, p3, p4, p5, p6);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0, p1, p2, p3, p4, p5, p6,p7);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0, p1, p2, p3, p4, p5, p6,p7,p8);
		
	}

	@Override
	public void log(Level level, Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4,
			Object p5, Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		logger.log(level, marker, message, p0, p1, p2, p3, p4, p5, p6,p7,p8,p9);
		
	}

	@Override
	public void log(Level level, String message, Object p0) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0);
		
	}

	@Override
	public void log(Level level, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0, p1);
		
	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0, p1, p2);
		
	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0, p1, p2, p3);
		
	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0, p1, p2, p3, p4);
		
	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0, p1, p2, p3, p4, p5);
		
	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0, p1, p2, p3, p4, p5, p6);
		
	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0, p1, p2, p3, p4, p5, p6, p7);
		
	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0, p1, p2, p3, p4, p5, p6, p7,p8);
		
	}

	@Override
	public void log(Level level, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		logger.log(level, message, p0, p1, p2, p3, p4, p5, p6, p7,p8,p9);
		
	}

	@Override
	public void printf(Level level, Marker marker, String format, Object... params) {
		// TODO Auto-generated method stub
		logger.printf(level,marker, format, params);
		
	}

	@Override
	public void printf(Level level, String format, Object... params) {
		// TODO Auto-generated method stub
		logger.printf(level, format, params);
		
	}

	@Override
	public <T extends Throwable> T throwing(Level level, T throwable) {
		// TODO Auto-generated method stub
		return logger.throwing(level, throwable);
	}

	@Override
	public <T extends Throwable> T throwing(T throwable) {
		// TODO Auto-generated method stub
		return logger.throwing(throwable);
	}

	@Override
	public void trace(Marker marker, Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message);
		}
		
	}

	@Override
	public void trace(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, throwable);
		}
		
	}

	@Override
	public void trace(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, messageSupplier);
		}
		
	}

	@Override
	public void trace(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void trace(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message);
		}
		
	}

	@Override
	public void trace(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, throwable);
		}
		
	}

	@Override
	public void trace(Marker marker, Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message);
		}
		
	}

	@Override
	public void trace(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, throwable);
		}
		
	}

	@Override
	public void trace(Marker marker, String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, params);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, paramSuppliers);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, throwable);
		}
		
	}

	@Override
	public void trace(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, messageSupplier);
		}
		
	}

	@Override
	public void trace(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void trace(Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message);
		}
		
	}

	@Override
	public void trace(Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, throwable);
		}
		
	}

	@Override
	public void trace(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(messageSupplier);
		}
		
	}

	@Override
	public void trace(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(messageSupplier, throwable);
		}
		
	}

	@Override
	public void trace(CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message);
		}
		
	}

	@Override
	public void trace(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, throwable);
		}
		
	}

	@Override
	public void trace(Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message);
		}
		
	}

	@Override
	public void trace(Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, throwable);
		}
		
	}

	@Override
	public void trace(String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message);
		}
		
	}

	@Override
	public void trace(String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, params);
		}
		
	}

	@Override
	public void trace(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, paramSuppliers);
		}
		
	}

	@Override
	public void trace(String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, throwable);
		}
		
	}

	@Override
	public void trace(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(messageSupplier);
		}
		
	}

	@Override
	public void trace(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(messageSupplier, throwable);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0, p1);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0, p1, p2);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8);
		}
		
	}

	@Override
	public void trace(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8,p9);
		}
		
	}

	@Override
	public void trace(String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0);
		}
		
	}

	@Override
	public void trace(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0, p1);
		}
		
	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0, p1, p2);
		}
		
	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
		}
		
	}

	@Override
	public void trace(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.TRACE))
		{
			logger.trace(message, p0, p1, p2, p3, p4, p5, p6, p7, p8,p9);
		}
		
	}

	@Override
	public EntryMessage traceEntry() {
		// TODO Auto-generated method stub
		return logger.traceEntry();
	}

	@Override
	public EntryMessage traceEntry(String format, Object... params) {
		// TODO Auto-generated method stub
		return logger.traceEntry(format, params);
	}

	@Override
	public EntryMessage traceEntry(Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		return logger.traceEntry(paramSuppliers);
	}

	@Override
	public EntryMessage traceEntry(String format, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		return logger.traceEntry(format, paramSuppliers);
	}

	@Override
	public EntryMessage traceEntry(Message message) {
		// TODO Auto-generated method stub
		return logger.traceEntry(message);
	}

	@Override
	public void traceExit() {
		// TODO Auto-generated method stub
		logger.traceExit();
	}

	@Override
	public <R> R traceExit(R result) {
		// TODO Auto-generated method stub
		return logger.traceExit(result);
	}

	@Override
	public <R> R traceExit(String format, R result) {
		// TODO Auto-generated method stub
		return logger.traceExit(format, result);
	}

	@Override
	public void traceExit(EntryMessage message) {
		// TODO Auto-generated method stub
		logger.traceExit(message);
		
	}

	@Override
	public <R> R traceExit(EntryMessage message, R result) {
		// TODO Auto-generated method stub
		return logger.traceExit(message, result);
	}

	@Override
	public <R> R traceExit(Message message, R result) {
		// TODO Auto-generated method stub
		return logger.traceExit(message, result);
	}

	@Override
	public void warn(Marker marker, Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message);
		}
		
	}

	@Override
	public void warn(Marker marker, Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, throwable);
		}
		
	}

	@Override
	public void warn(Marker marker, MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, messageSupplier); 
		}
		
	}

	@Override
	public void warn(Marker marker, MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void warn(Marker marker, CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message);
		}
		
	}

	@Override
	public void warn(Marker marker, CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, throwable);
		}
		
	}

	@Override
	public void warn(Marker marker, Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message);
		}
		
	}

	@Override
	public void warn(Marker marker, Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, throwable);
		}
		
	}

	@Override
	public void warn(Marker marker, String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, params);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, paramSuppliers);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, throwable);
		}
		
	}

	@Override
	public void warn(Marker marker, Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, messageSupplier);
		}
	}

	@Override
	public void warn(Marker marker, Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, messageSupplier, throwable);
		}
		
	}

	@Override
	public void warn(Message message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message);
		}
		
	}

	@Override
	public void warn(Message message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, throwable);
		}
		
	}

	@Override
	public void warn(MessageSupplier messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(messageSupplier);
		}
		
	}

	@Override
	public void warn(MessageSupplier messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(messageSupplier, throwable);
		}
		
	}

	@Override
	public void warn(CharSequence message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message);
		}
		
	}

	@Override
	public void warn(CharSequence message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, throwable);
		}
		
	}

	@Override
	public void warn(Object message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message);
		}
		
	}

	@Override
	public void warn(Object message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, throwable);
		}
		
	}

	@Override
	public void warn(String message) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message);
		}
		
	}

	@Override
	public void warn(String message, Object... params) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, params);
		}
		
	}

	@Override
	public void warn(String message, Supplier<?>... paramSuppliers) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, paramSuppliers);
		}
		
	}

	@Override
	public void warn(String message, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, throwable);
		}
		
	}

	@Override
	public void warn(Supplier<?> messageSupplier) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(messageSupplier);
		}
		
	}

	@Override
	public void warn(Supplier<?> messageSupplier, Throwable throwable) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(messageSupplier, throwable);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0, p1);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0, p1, p2);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8);
		}
		
	}

	@Override
	public void warn(Marker marker, String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5,
			Object p6, Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(marker, message, p0, p1, p2, p3, p4, p5, p6, p7,p8,p9);
		}
		
	}

	@Override
	public void warn(String message, Object p0) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0);
		}
		
	}

	@Override
	public void warn(String message, Object p0, Object p1) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0, p1);
		}
		
	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0, p1, p2);
		}
		
	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0, p1, p2, p3);
		}
		
	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0, p1, p2, p3, p4);
		}
		
	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0, p1, p2, p3, p4, p5);
		}
		
	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0, p1, p2, p3, p4, p5, p6);
		}
		
	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0, p1, p2, p3, p4, p5, p6, p7);
		}
		
	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0, p1, p2, p3, p4, p5, p6, p7, p8);
		}
		
	}

	@Override
	public void warn(String message, Object p0, Object p1, Object p2, Object p3, Object p4, Object p5, Object p6,
			Object p7, Object p8, Object p9) {
		// TODO Auto-generated method stub
		if(isEnabled(Level.WARN))
		{
			logger.warn(message, p0, p1, p2, p3, p4, p5, p6, p7, p8,p9);
		}
		
	}
	
	/**
	   * @return This will give you the original stack trace from the class where the log command was
	   *         issued.
	   */
	  private StackTraceElement getLoggingMethodStackTrace() {
	    StackTraceElement[] stackTraces = Thread.currentThread().getStackTrace();
	    return LoggerContext.getLogStrackTraceElement(stackTraces, ILogger.class);   
	  }

	  public void debug(String message, StackTraceElement stackTrace) {    
		    if (isEnabled(Level.DEBUG)) {
		      logger.debug(message, stackTrace);
		    }
		  }
	  
	  /**
	   * Method to Handle errors.
	   */
	  public void error(String message, StackTraceElement stackTrace) {   
	    if (isEnabled(Level.ERROR)) {
	      logger.error(message, stackTrace);
	    }
	  }
	  
	  /**
	   * Method for Info.
	   */
	  public void info(String message, StackTraceElement stackTrace) {
	    if (isEnabled(Level.INFO)) {
	      logger.info(message, stackTrace);
	    }
	  }

	
	
	

}
