SELECT DISTINCT A.USER_ID, A.PRODUCT_ID FROM ONLINE_SALE A
WHERE 1 < (SELECT COUNT(B.ONLINE_SALE_ID) FROM ONLINE_SALE B WHERE B.USER_ID = A.USER_ID AND B.PRODUCT_ID = A.PRODUCT_ID)
ORDER BY USER_ID ASC, PRODUCT_ID DESC;