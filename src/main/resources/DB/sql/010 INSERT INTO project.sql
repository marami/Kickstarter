INSERT INTO project(name, description, goal, pledged, daysToGo, history, link, category_id)
VALUES 

('Flobots\' TWO NEW ALBUMS for 2016 "NOENEMIES"', 
'NEW ALBUM by FLOBOTS. We\'ve been asking you to raise your voice. Now it is time to raise ours. Actually, let\'s raise them together.',
72390,  
50000,  
12,  
'After months of dropping hints at shows and teasing you on Twitter, we are pleased to announce that production on the fourth Flobots record is underway.', 
'https://d2pq0u4uni88oo.cloudfront.net/projects/2119077/video-596491-h264_high.mp4',  
(select id from category where name='Music')),

('North Eugene Ukulele Allstars Uke It Old-School!', 
'We\'re back for a second album. This time with new kids, new songs, and a new name!', 
10000,  
543,  
24,  
'In 2007, a few students at North Eugene High School in Eugene, Oregon asked their teacher to teach them how to play the ukulele. Today those students have graduated and moved on, but what they started still remains. Now nearly nine years later, the North Eugene Ukulele Allstars are ready to throw it down with their second album: Ukeing It Old-School!', 
'https://d2pq0u4uni88oo.cloudfront.net/projects/2128669/video-608005-h264_high.mp4',  
(select id from category where name='Music')),

('ATAGONIA - A new full-length album from Sheridan Fox', 
'Help Sheridan finish manufacturing his new album so he can send it to you. Yeah, you! @thesheridanfox sheridanfox.com #patagoniaalbum',
35000,  
3500,  
25,  
'The birth canal- I recorded this album in fits and spurts the last handful of years in places I’ve lived, with the bulk of stuff happening in Minnesota and Alaska when I wasn\'t on tour. The album was mixed at Old Blackberry Way, mastered at Magneto Mastering, and the vinyl lacquers cut at Chicago Mastering.', 
'https://d2pq0u4uni88oo.cloudfront.net/projects/1386341/video-606904-h264_high.mp4',  
(select id from category where name='Music')),

('Heather\'s Choice // Meals for Adventuring', 
'Dehydrated meals + snacks for your next adventure! Gluten, soy, and dairy free, sustainably sourced + delicious. ',
48000,  7281,  34,  
'Heather\'s Choice® is a line of dehydrated meals and snacks for adventuring. Established in Alaska, we first started supplying food for our adventurous friends in 2014. Since then, our meals have traveled world wide, from the top of Everest to the beaches of New Zealand and beyond!', 
'https://d2pq0u4uni88oo.cloudfront.net/projects/908102/video-607860-h264_high.mp4',  
(select id from category where name='Food')),

('TRUEnergy - World\'s First Organic Sports Shot', 
'Infused with vitamins, electrolytes, and green tea extract, TRUEnergy is a honey sweetened sports beverage to help you perform better.',
40000,  1397,  19,  
'The original concept for TRUEnergy was envisioned over two years ago. After investing tens of thousands of hours and dollars, our team has brought the concept to what Malcolm Gladwell would call a "Tipping Point". With the raised capital, we will have the opportunity to order our first run of our innovative sports beverage, and deliver it to the backers.', 
'https://d2pq0u4uni88oo.cloudfront.net/projects/2177700/video-606530-h264_high.mp4',  
(select id from category where name='Food')),

('The Cafe Meow: First Cat Cafe in Minneapolis', 
'A new coffee shop experience for a cool city. A place for quality coffee and cat companionship. Join us in making it a reality',
15000,  6183,  27,  
'We want to bring the Japanese cat cafe experience to Minnesota. The Cafe Meow will offer local, organic, quality coffees and teas for drinking along with local, playful, cuddly cats for loving! You can come in and relieve some stress by lounging with a latte and cuddling with a catte.', 
'https://d2pq0u4uni88oo.cloudfront.net/projects/2118404/video-607558-h264_high.mp4',  
(select id from category where name='Food')),

('HYMN: A Solo for 7', 
'Anneke Hansen Dance premieres 6 performances of a new work at the gorgeous Irondale Theater in Brooklyn, December 2nd through 5th! ',
3138,  3000,  7,  
'"There is a marvelously artisanal quality to Ms. Hansen’s delicately wrought choreography, which takes full account of the notion of live art as something that occurs in a shared space, through the concentrated cooperation of artists and audience members."', 
'https://d2pq0u4uni88oo.cloudfront.net/projects/2145080/video-604200-h264_high.mp4',  
(select id from category where name='Dances')),

('The Brooklyn Nutcracker Sweet!', 
'Be a part of Brooklyn dance history--The Brooklyn Nutcracker Sweet!, a sparkling production updated from the original Nutcracker.',
15000,  3982,  27,  
'Be a part of Brooklyn dance history! -- Brooklyn Ballet\'s The Brooklyn Nutcracker Sweet! is a sparkling, innovative series of dances, updated from the original Nutcracker with Brooklyn cultural and techno style, premiering in downtown Brooklyn on December 9-13, 2015 at The Actors Fund Arts Center. Click here to read more about the show or purchase tickets. ', 
'https://d2pq0u4uni88oo.cloudfront.net/projects/2138491/video-605929-h264_high.mp4',  
(select id from category where name='Dances')),

('Shift the Grid presents Vacancy', 
'Vacancy: A contemporary dance performance produced collaboratively by 6 minds exploring what it feels like to be in two places at once.',
3200,  2895,  61,  
'So we embarked on the impossible. Collaborating with the usual six minds in the room, and bringing in three more to the mix, over the past six months. Shift the Grid is coming up on it’s year anniversary and has been selected as the resident artist for Motion Pacific’s Incubator project. We are honored and lucky to have the opportunity as an incredibly young collective, to embark on the journey of putting on our own evening lengths work.', 
'https://d2pq0u4uni88oo.cloudfront.net/projects/2153340/video-600743-h264_high.mp4',  
(select id from category where name='Dances'));






