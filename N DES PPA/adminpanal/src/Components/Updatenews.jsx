import React from 'react';
import { useState,useEffect } from 'react';
import { useNavigate, useParams} from 'react-router-dom';
import { getnews, updatenews} from './databaseC'



function Updatenews(){
    const [news_headline, setnewsheadline] = useState('');
    const [news_details, setnewsdetails] = useState('');
    const [news_location, setNewsLocation] = useState('');
    const [news_date, setNewsDate] = useState('');
    const [news_img, setNewsImg] = useState('');
    const {news_id}=useParams();
    const navigate = useNavigate();

    useEffect(() => {
      console.log(news_id);
      if (news_id) {

        

        getnews(news_id)
          .then((response) => {
            const data = response.data;
            setnewsheadline(data.news_headline);
            setnewsdetails(data.news_details);
            setNewsLocation(data.news_location);
            setNewsDate(data.news_date);
            setNewsImg(data.news_img);
          })
          .catch((error) => {
            console.error('Error fetching data', error);
          });
      }
    }, [news_id]);



    const [error, setError] = useState({
        news_headline: '',
        news_details: '',
        news_location: '',
        news_date: '',
        news_img: ''
      });





      function validate() {
            let valid = true;
            const errors = { ...error };
          
            if (news_headline.trim()) {
              errors.news_headline = '';
            } else {
              errors.news_headline = 'News Headline is required';
              valid = false;
            }
          
            if (news_details.trim()) {
              errors.news_details = '';
            } else {
              errors.news_details = 'News Details is required';
              valid = false;
            }
          
            if (news_location.trim()) {
              errors.news_location = '';
            } else {
              errors.news_location = 'News Location is required';
              valid = false;
            }
          
            if (news_date.trim()) {
              errors.news_date = '';
            } else {
              errors.news_date = 'News Date is required';
              valid = false;
            }
          
            if (news_img.trim()) {
              errors.news_img = '';
            } else {
              errors.news_img = 'News Image is required';
              valid = false;
            }
          
            setError(errors);
          
            return valid;
          }
          

    const handleSubmit = (e) => {


      console.log(validate());

        e.preventDefault();
        if (validate()) {
          const news = {
            news_date,
            news_details,
            news_headline,
            news_img,
            news_location,
          };
          console.log(news);

          updatenews(news_id, news)
          .then((response) => {
            console.log(response);
            alert('News updated successfully');
            navigate('/');
          })
          .catch((error) => {
            console.error('Error updating data', error);
          });
          
        }
    }

          
  return (
    <div className='addnews' id=''>
      <form>
        <label>News Headline</label>
        <input type='text' placeholder='Enter News Headline' value={news_headline} name='news_headline' onChange={(e) => setnewsheadline(e.target.value)} required/>
        
        <label>News Details</label>
        <input type='text' placeholder='Enter News Details' value={news_details} name='news_details' onChange={(e) => setnewsdetails(e.target.value)} required/>

        <label>News Location</label>
        <input type='text' placeholder='Enter News Location' value={news_location} name='news_location' onChange={(e) => setNewsLocation(e.target.value)} required/>

        <label>News Date</label>
        <input type='date' value={news_date} name='news_date' onChange={(e) => setNewsDate(e.target.value)} required/>

        <label>News Image</label>
        <input type='text' placeholder='Enter News Image Path' name='news_img' value={news_img} onChange={(e) => setNewsImg(e.target.value)} required/>

        <div className='btn'>
          <button value='Submit' onClick={handleSubmit}>Update</button>
        </div>
      </form>
    </div>
  );
}

export default Updatenews;
