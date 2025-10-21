import React, { useEffect,useState } from 'react'
import {deletenews, listnews} from './databaseC';
import { useNavigate } from "react-router-dom";

function Header() {
  const navigate = useNavigate();

const [news, setNews] = useState([]);
useEffect(()=>{getnewsdata()},[])


function getnewsdata()
{
    listnews().then((response) => {

    setNews(response.data);

      }).catch(error => {

          console.error('Error fetching data: ', error);

      })

}

function deletenewsBYid(news_id)
{
  const confirmDelete = window.confirm('I think you click the wrong button.');

        if (confirmDelete) {
            console.log(news_id);

            deletenews(news_id).then((response) => 
            {
              getnewsdata();
            })
            .catch(error => 
            {
                console.error('Error deleting data: ', error);
            });
        }
}

function updatenewsBYid(news_id){
  console.log(news_id);
  navigate(`/updatenews/${news_id}`);
  // window.location.href = `/updatenews/${news_id}`;
}



  return (






    
      <div className='name'>
      <table className="simple-table">
        <thead>
          <tr>
            <th>news_id</th>
            <th>news_headline</th>
            <th>news_details</th>
            <th>news_location</th>
            <th>news_date</th>
            <th>news_img</th>
            <th>action</th>
          </tr>
        </thead>
        <tbody>
          {news.map(news=>
          <tr>
            <td>{news.news_id}</td>
            <td> {news.news_headline}</td>
            <td>{news.news_details}</td>
            <td>{news.news_location}</td>
            <td>{news.news_date}</td>
            <td>{news.news_img}</td>
            <button onClick={()=>updatenewsBYid(news.news_id)}>Update</button>
            <button onClick={()=>deletenewsBYid(news.news_id)}>Delete</button>
          </tr>
          )}
        </tbody>
      </table>

      </div>
  )
}
  
export default Header;
