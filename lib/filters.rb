class PrettyPrint < Nanoc::Filter
  identifier :prettyprint

  def run(content, params={})
    content = content.gsub(/<pre>/, '<pre class="prettyprint">')
  end
end

class PrettyPrintInline < Nanoc::Filter
  identifier :prettyprintinline

  def run(content, params={})
    content = content.gsub(/`[^`]*`/) do |inline| 
      inline << "{:.kwd}"
    end
  end
end

class Bootstrapify < Nanoc::Filter
  identifier :bootstrapify

  def run(content, params={})
    content.gsub(/^---*$/) { |s| s << "\n{:.page-header}" }
    .gsub(/''.+''/) { |s| "<small>" << s.gsub("'", "") << "</small>" }
  end
end
