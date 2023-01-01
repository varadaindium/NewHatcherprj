package pages;
import iSAFE.ApplicationKeywords;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMultipart;

import org.jsoup.Jsoup;

import baseClass.BaseClass;

public class EmailReaderPage extends ApplicationKeywords
{	
	public EmailReaderPage(BaseClass obj) 
	{
		super(obj);
	}
	/**
	 * @author VijayaKumar.U
	 * 
	 * This method returns the Investor account Active URL.
	 * @param emailServer,
	 * @param emailUsername,emailPassword,emailSubject.
	 * 
	 */
	public String getInvestorAccountActivateURL(String mailServer, String emailUsername, String emailPassword, String emailSubject) 
	{
		waitTime(20);
		
		String contentType = null;
		String mailBodyContent = null;
		String mailBodyContentFull = null;
		String mailContent = null;
		String investorAccountActivateURL = null;
		Address mailFrom;
		int mailRecivedDate = 0;
		int mailRecivedMonth = 0;
		int mailRecivedYear = 0;
		int mailRecivedHours = 0;
		int mailRecivedMinutes = 0;
		String mailSubject = null;
		Object obj;
		Multipart mp;
		BodyPart bp;

		try		{
			String text;
			Properties props = new Properties();
			props.put("mail.store.protocol", "imaps");

			Session session = Session.getInstance(props);
			Store store = session.getStore("imaps");

			System.out.println("Email Username: "+emailUsername);
			System.out.println("Email Password: "+emailPassword);
			store.connect("imap.gmail.com", emailUsername, emailPassword);

				int unreadcount = store.getFolder("INBOX").getUnreadMessageCount();
			Folder folder = store.getFolder("INBOX");

			folder.open(Folder.READ_WRITE);

			Message[] messages = folder.getMessages();
			
			int j=1;

			for(int i=0;i<messages.length;i++)	{	
				Message message = messages[i];
				contentType = message.getContentType();
				
				if (contentType.contains("TEXT/PLAIN")) {
					mailFrom = message.getFrom()[0];
					mailRecivedDate = message.getReceivedDate().getDate();
					mailRecivedMonth = message.getReceivedDate().getMonth();
					mailRecivedYear = message.getReceivedDate().getYear();
					mailRecivedHours = message.getReceivedDate().getHours();
					mailRecivedMinutes = message.getReceivedDate().getMinutes();
					mailSubject = (String)message.getSubject();

					if (mailSubject.contains(emailSubject)) {
						mailBodyContentFull = getMailBodyTextFromMessage(message);					
						mailBodyContent = mailBodyContentFull.substring(mailBodyContentFull.lastIndexOf("Please"), mailBodyContentFull.length());
						investorAccountActivateURL = mailBodyContentFull.substring(mailBodyContentFull.lastIndexOf("account")+8, mailBodyContentFull.indexOf("Thank you, Team Hatcher+ Need help")).trim();
					
						message.setFlag(Flags.Flag.DELETED, true);
					}
					else{
						mailFrom = message.getFrom()[0];
						mailRecivedDate = message.getReceivedDate().getDate();
						mailRecivedMonth = message.getReceivedDate().getMonth();
						mailRecivedYear = message.getReceivedDate().getYear();
						mailRecivedHours = message.getReceivedDate().getHours();
						mailRecivedMinutes = message.getReceivedDate().getMinutes();
						mailSubject = (String)message.getSubject();

						mailBodyContent = getMailBodyTextFromMessage(message);
						message.setFlag(Flags.Flag.DELETED, true);
					}
					j=j+1;
				} 
				else if(contentType.contains("TEXT/HTML"))				{
					mailFrom = message.getFrom()[0];
					mailRecivedDate = message.getReceivedDate().getDate();
					mailRecivedMonth = message.getReceivedDate().getMonth();
					mailRecivedYear = message.getReceivedDate().getYear();
					mailRecivedHours = message.getReceivedDate().getHours();
					mailRecivedMinutes = message.getReceivedDate().getMinutes();
					mailSubject = (String)message.getSubject();

					if (mailSubject.contains(emailSubject)) 
					{
						mailBodyContentFull = getMailBodyTextFromMessage(message);

						mailBodyContent = mailBodyContentFull.substring(mailBodyContentFull.lastIndexOf("Please"), mailBodyContentFull.length());
						investorAccountActivateURL = mailBodyContentFull.substring(mailBodyContentFull.lastIndexOf("account")+8, mailBodyContentFull.indexOf("Thank you, Team Hatcher+ Need help")).trim();
						message.setFlag(Flags.Flag.DELETED, true);
					}
					else	{
						mailFrom = message.getFrom()[0];
						mailRecivedDate = message.getReceivedDate().getDate();
						mailRecivedMonth = message.getReceivedDate().getMonth();
						mailRecivedYear = message.getReceivedDate().getYear();
						mailRecivedHours = message.getReceivedDate().getHours();
						mailRecivedMinutes = message.getReceivedDate().getMinutes();
						mailSubject = (String)message.getSubject();

						mailBodyContent = getMailBodyTextFromMessage(message);

						message.setFlag(Flags.Flag.DELETED, true);
					}
					j=j+1;
				}
				else if(contentType.contains("MULTIPART/*"))
				{
					mailFrom = message.getFrom()[0];
					mailRecivedDate = message.getReceivedDate().getDate();
					mailRecivedMonth = message.getReceivedDate().getMonth();
					mailRecivedYear = message.getReceivedDate().getYear();
					mailRecivedHours = message.getReceivedDate().getHours();
					mailRecivedMinutes = message.getReceivedDate().getMinutes();
					mailSubject = (String)message.getSubject();

					if (mailSubject.contains(emailSubject)) 
					{
						obj = message.getContent();
						mp = (Multipart) obj;
						bp = mp.getBodyPart(0);
						mailContent = bp.getContent().toString().trim();
					
						mailBodyContent = getMailBodyTextFromMessage(message);

						message.setFlag(Flags.Flag.DELETED, true);
					}
					else
					{
						obj = message.getContent();
						mp = (Multipart) obj;
						bp = mp.getBodyPart(0);
						mailContent = bp.getContent().toString().trim();
					
						mailBodyContent = getMailBodyTextFromMessage(message);

						message.setFlag(Flags.Flag.DELETED, true);
					}
					j=j+1;
				}
			}
			folder.close(true);
			store.close();
		}
		catch(MessagingException ME)
		{
			ME.printStackTrace();
		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}
		return investorAccountActivateURL;
	}
	/**
	*@author VijayaKumar.U
	*
	*This method returns the contact active URL.
	*@param mailServer
	*@param emailUSer
	*@param emailPAssword
	*@param emailSubject.
	*/
	public String getNewContactActivateURL(String mailServer, String emailUsername, String emailPassword, String emailSubject) 
	{
		waitTime(8);
		
		String contentType = null;
		String mailBodyContent = null;
		String mailBodyContentFull = null;
		String mailContent = null;
		String investorAccountActivateURL = null;
		Address mailFrom;
		int mailRecivedDate = 0;
		int mailRecivedMonth = 0;
		int mailRecivedYear = 0;
		int mailRecivedHours = 0;
		int mailRecivedMinutes = 0;
		String mailSubject = null;
		Object obj;
		Multipart mp;
		BodyPart bp;

		try	{
			String text;
			Properties props = new Properties();
			props.put("mail.store.protocol", "imaps");
			Session session = Session.getInstance(props);
			Store store = session.getStore("imaps");
		
			store.connect("imap.gmail.com", emailUsername, emailPassword);

			int unreadcount = store.getFolder("INBOX").getUnreadMessageCount();
			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_WRITE);
			Message[] messages = folder.getMessages();
			
			int j=1;
			for(int i=0;i<messages.length;i++)	{	
			
				Message message = messages[i];
				contentType = message.getContentType();
			if (contentType.contains("TEXT/PLAIN")) {
					mailFrom = message.getFrom()[0];
					mailRecivedDate = message.getReceivedDate().getDate();
					mailRecivedMonth = message.getReceivedDate().getMonth();
					mailRecivedYear = message.getReceivedDate().getYear();
					mailRecivedHours = message.getReceivedDate().getHours();
					mailRecivedMinutes = message.getReceivedDate().getMinutes();
					mailSubject = (String)message.getSubject();

					if (mailSubject.contains(emailSubject)) {
						mailBodyContentFull = getMailBodyTextFromMessage(message);
						mailBodyContent = mailBodyContentFull.substring(0, mailBodyContentFull.lastIndexOf("Best regards"));
						investorAccountActivateURL = mailBodyContent.substring(mailBodyContent.indexOf("You may activate your Hatcher+ account by clicking the following link:")+71, mailBodyContent.length());
						message.setFlag(Flags.Flag.DELETED, true);
					}
					else{
						mailFrom = message.getFrom()[0];
						mailRecivedDate = message.getReceivedDate().getDate();
						mailRecivedMonth = message.getReceivedDate().getMonth();
						mailRecivedYear = message.getReceivedDate().getYear();
						mailRecivedHours = message.getReceivedDate().getHours();
						mailRecivedMinutes = message.getReceivedDate().getMinutes();
						mailSubject = (String)message.getSubject();
						mailBodyContent = getMailBodyTextFromMessage(message);
						message.setFlag(Flags.Flag.DELETED, true);
					}
					j=j+1;
				} 
				else if(contentType.contains("TEXT/HTML"))	{
					mailFrom = message.getFrom()[0];
					mailRecivedDate = message.getReceivedDate().getDate();
					mailRecivedMonth = message.getReceivedDate().getMonth();
					mailRecivedYear = message.getReceivedDate().getYear();
					mailRecivedHours = message.getReceivedDate().getHours();
					mailRecivedMinutes = message.getReceivedDate().getMinutes();
					mailSubject = (String)message.getSubject();

					if (mailSubject.contains(emailSubject)) 			{
						mailBodyContentFull = getMailBodyTextFromMessage(message);
						mailBodyContent = mailBodyContentFull.substring(0, mailBodyContentFull.lastIndexOf("Best regards"));
						investorAccountActivateURL = mailBodyContent.substring(mailBodyContent.indexOf("You may activate your Hatcher+ account by clicking the following link:")+71, mailBodyContent.length());
						message.setFlag(Flags.Flag.DELETED, true);
					}
					else{
						mailFrom = message.getFrom()[0];
						mailRecivedDate = message.getReceivedDate().getDate();
						mailRecivedMonth = message.getReceivedDate().getMonth();
						mailRecivedYear = message.getReceivedDate().getYear();
						mailRecivedHours = message.getReceivedDate().getHours();
						mailRecivedMinutes = message.getReceivedDate().getMinutes();
						mailSubject = (String)message.getSubject();

						mailBodyContent = getMailBodyTextFromMessage(message);

						message.setFlag(Flags.Flag.DELETED, true);
					}
					j=j+1;
				}
				else if(contentType.contains("MULTIPART/*")){
					mailFrom = message.getFrom()[0];
					mailRecivedDate = message.getReceivedDate().getDate();
					mailRecivedMonth = message.getReceivedDate().getMonth();
					mailRecivedYear = message.getReceivedDate().getYear();
					mailRecivedHours = message.getReceivedDate().getHours();
					mailRecivedMinutes = message.getReceivedDate().getMinutes();
					mailSubject = (String)message.getSubject();

					if (mailSubject.contains(emailSubject)) {
						obj = message.getContent();
						mp = (Multipart) obj;
						bp = mp.getBodyPart(0);
						mailContent = bp.getContent().toString().trim();
						mailBodyContent = getMailBodyTextFromMessage(message);
						message.setFlag(Flags.Flag.DELETED, true);
					}
					else{
						obj = message.getContent();
						mp = (Multipart) obj;
						bp = mp.getBodyPart(0);
						mailContent = bp.getContent().toString().trim();
						mailBodyContent = getMailBodyTextFromMessage(message);
						message.setFlag(Flags.Flag.DELETED, true);
					}
					j=j+1;
				}		}
			folder.close(true);
			store.close();
		}
		catch(MessagingException ME){
			ME.printStackTrace();
		}
		catch(Exception e)	{
			throw new RuntimeException(e);
		}
		return investorAccountActivateURL;
	}
	/**
	*@author VijayaKumar.U
	*
	*This method returns the mail message.
	*@param message
	*/
	public static String getMailBodyTextFromMessage(Message message) throws MessagingException, IOException 	{
	
		String content = "";
		String bodyContent = "";
		MimeMultipart mimeMultipart;

		if (message.isMimeType("text/plain")) 		{
			content = message.getContent().toString().trim();
			bodyContent = content;
						} 
		else if (message.isMimeType("TEXT/HTML")) 		{
			content = message.getContent().toString();
			Object contentHTMLStripped = content + "\n" + Jsoup.parse(content).text().trim();
			bodyContent = contentHTMLStripped.toString().trim();
					}
		else if(message.isMimeType("multipart/*"))		{
			mimeMultipart = (MimeMultipart) message.getContent();
		}
		return bodyContent;
	}

	/**
	 * This method returns the multipart of the mail text.
	*@author VijayaKumar.U
	*@param mimeMultipart
	*
	*/
	public static String getMailBodyTextFromMimeMultipart(MimeMultipart mimeMultipart)  throws MessagingException, IOException
	{
		String result = "";
		String content = "";
		Object bodyContentObj;
		String bodyContent = "";

		int count = mimeMultipart.getCount();
		for (int k = 0; k < count; k++) 		{
			BodyPart bodyPart = mimeMultipart.getBodyPart(k);
			if (bodyPart.isMimeType("TEXT/PLAIN"))	{
				bodyContentObj = bodyPart.getContent();
				bodyContent = bodyContentObj.toString().trim();
				result = result+ "\n" +bodyContent;
				content = result;
			}
			else if (bodyPart.isMimeType("text/html"))	{
				bodyContentObj = bodyPart.getContent();
				bodyContent = bodyContentObj.toString().trim();
				result = result + "\n" + Jsoup.parse(bodyContent).text();
				content = result;
			}
			else if (bodyPart.getContent() instanceof MimeMultipart)	{
				bodyContentObj = bodyPart.getContent();
				content = getMailBodyTextFromMimeMultipart((MimeMultipart)bodyContentObj);
			}		}
		return result;
	}
	/**
	 * This method return the received month details of the mail.
	 * 
	 * @param mailRecivedMonth
	*@author VijayaKumar.U
	*/

	public static String month(int mailRecivedMonth)	{
		String month = null;
		switch (mailRecivedMonth) 	{
		case 0:
			month="Jan";
			break;
		case 1:
			month="Feb";
			break;
		case 2:
			month="Mar";
			break;
		case 3:
			month="Apr";
			break;
		case 4:
			month="May";
			break;
		case 5:
			month="Jun";
			break;
		case 6:
			month="Jul";
			break;
		case 7:
			month="Aug";
			break;
		case 8:
			month="Sep";
			break;
		case 9:
			month="Oct";
			break;
		case 10:
			month="Nov";
			break;
		case 11:
			month="Dec";
			break;
		default:
			break;
		}
		return month;
	}

	public static int year(int mailRecivedYear)	{
		String Year = Integer.toString(mailRecivedYear);

		String YearEdited = Year.substring(1, Year.length());

		int year = Integer.parseInt(YearEdited);

		return year;
	}

	/**
	*This method returns the time in hours of the received mail.
	*
	*@param mailReceivedHours
	*@author VijayaKumar.U
	*/

	public static int timeHours(int mailReceivedHours)	{
		int hours = 0;
		switch (mailReceivedHours) 
		{
		case 1:
			hours=1;
			break;
		case 2:
			hours=2;
			break;
		case 3:
			hours=3;
			break;
		case 4:
			hours=4;
			break;
		case 5:
			hours=5;
			break;
		case 6:
			hours=6;
			break;
		case 7:
			hours=7;
			break;
		case 8:
			hours=8;
			break;
		case 9:
			hours=9;
			break;
		case 10:
			hours=10;
			break;
		case 11:
			hours=11;
			break;
		case 12:
			hours=12;
			break;
		case 13:
			hours=1;
			break;
		case 14:
			hours=1;
			break;
		case 15:
			hours=3;
			break;
		case 16:
			hours=4;
			break;
		case 17:
			hours=5;
			break;
		case 18:
			hours=6;
			break;
		case 19:
			hours=7;
			break;
		case 20:
			hours=8;
			break;
		case 21:
			hours=9;
			break;
		case 22:
			hours=10;
			break;
		case 23:
			hours=11;
			break;
		case 24:
			hours=12;
			break;
		case 0:
			hours=12;
			break;
		default:
			break;
		}
		return hours;
	}
	/**
	*This method is used to return the mail received time.
	*
	*@param mailRecivedHours
	*@author VijayaKumar.U
	*/
	public static String timeMedeium(int mailRecivedHours)
	{
		String medium = null;
		switch (mailRecivedHours) 		{
		case 1:
			medium="AM";
			break;
		case 2:
			medium="AM";
			break;
		case 3:
			medium="AM";
			break;
		case 4:
			medium="AM";
			break;
		case 5:
			medium="AM";
			break;
		case 6:
			medium="AM";
			break;
		case 7:
			medium="AM";
			break;
		case 8:
			medium="AM";
			break;
		case 9:
			medium="AM";
			break;
		case 10:
			medium="AM";
			break;
		case 11:
			medium="AM";
			break;
		case 12:
			medium="PM";
			break;
		case 13:
			medium="PM";
			break;
		case 14:
			medium="PM";
			break;
		case 15:
			medium="PM";
			break;
		case 16:
			medium="PM";
			break;
		case 17:
			medium="PM";
			break;
		case 18:
			medium="PM";
			break;
		case 19:
			medium="PM";
			break;
		case 20:
			medium="PM";
			break;
		case 21:
			medium="PM";
			break;
		case 22:
			medium="PM";
			break;
		case 23:
			medium="PM";
			break;
		case 24:
			medium="AM";
			break;
		default:
			break;
		}
		return medium;
	}}
