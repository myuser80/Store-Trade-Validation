

###### PROBLEM STATEMENT <h6> 
  There is a scenario where thousands of trades are flowing into one store, assume any way of transmission of trades. We need to create a one trade store, which stores the trade     in the following order.
  

Trade Id	Version	Counter-Party Id	Book-Id	Maturity Date	Created Date	Expired
T1	1	CP-1	B1	20/05/2020	<today date>	N
T2	2	CP-2	B1	20/05/2021	<today date>	N
T2	1	CP-1	B1	20/05/2021	14/03/2015	N
T3	3	CP-3	B2	20/05/2014	<today date>	Y



###### Needful Validation ###################
- During transmission if the lower version is being received by the store it will reject the trade and throw an exception. If the version is same it will override the existing record.
- Store should not allow the trade which has less maturity date then today date.
- Store should automatically update the expire flag if in a store the trade crosses the maturity date.


  
##### Built information  
- Java Project a springboot Hibernate JPA Application to handle Trade-Store-Managment
- Java Version Used:-JDK 1.8,JRE 1.8


Test Cases Description
Trade is added.
Version is high the list will be updated.
Version is same the list will be updated.
Version is low the trade will be rejected.
maturity Date is greater than todays date the trade is added.
maturity Date is lower than todays date the Trade will not be added.
Version is Same and date is lower the trade is not updated.
Maturity Date is Same as Todays Date the list will be added.
maturity date is low the trade will be rejected.
Maturity Date is Expired it will update the Expired Flag
  

