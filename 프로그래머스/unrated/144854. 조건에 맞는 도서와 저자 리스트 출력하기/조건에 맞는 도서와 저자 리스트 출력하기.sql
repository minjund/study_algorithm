-- 코드를 입력하세요
SELECT bo.BOOK_ID,au.AUTHOR_NAME, date_format(bo.PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
from BOOK bo 
inner join AUTHOR au 
on bo.AUTHOR_ID = au.AUTHOR_ID 
where bo.CATEGORY = '경제'
order by bo.PUBLISHED_DATE asc;